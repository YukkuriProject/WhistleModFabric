package io.rensatopc.github.rensato_whistle.blocks;

import io.rensatopc.github.rensato_whistle.registers.WhistleModSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockWhistle extends Block {
    public BlockWhistle() {
        super(Settings.create()
                .strength(Integer.MAX_VALUE)
        );
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.getPlayers().size() > 1) {
            for (PlayerEntity target:world.getPlayers()) {
                if (!(target.getUuid() == player.getUuid())) {
                    target.teleport(player.getX(), player.getY(), player.getZ());
                }
            }

            world.playSound(null, player.getBlockPos(), WhistleModSounds.WHISTLE_CLICK, SoundCategory.MASTER);
        } else {
            player.sendMessage(Text.translatable("string.whistle_cannotuse"), true);
        }

        return ActionResult.SUCCESS;
    }
}
