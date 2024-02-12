package io.rensatopc.github.rensato_whistle.items;

import io.rensatopc.github.rensato_whistle.registers.WhistleModSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
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

        return TypedActionResult.consume(itemStack);
    }
}
