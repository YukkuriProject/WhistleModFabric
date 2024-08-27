package io.thejustcube.github.whistle.util;

import io.thejustcube.github.whistle.items.ItemWhistle;
import io.thejustcube.github.whistle.registers.WhistleModSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class Whistle {
    public static void use(World world, PlayerEntity player, ItemWhistle whistle) {
        if (world.getPlayers().size() > 1) {
            player.getItemCooldownManager().set(whistle, 80);

            for (PlayerEntity target:world.getPlayers()) {
                if (!(target.getUuid() == player.getUuid())) {
                    target.teleport(player.getX(), player.getY(), player.getZ());
                }
            }

            world.playSound(null, player.getBlockPos(), WhistleModSounds.WHISTLE_CLICK, SoundCategory.MASTER);
        } else {
            player.sendMessage(Text.translatable("string.whistle.whistle_cannotuse"), true);
        }
    }
}
