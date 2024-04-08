package io.rensatopc.github.rensato_whistle.networking;

import io.rensatopc.github.rensato_whistle.WhistleModFabric;
import io.rensatopc.github.rensato_whistle.items.ItemWhistle;
import io.rensatopc.github.rensato_whistle.registers.WhistleModItems;
import io.rensatopc.github.rensato_whistle.util.Whistle;
import net.fabricmc.fabric.api.networking.v1.PacketType;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.util.Identifier;

import java.util.Set;

public class ModNetworking {
    public static final Identifier WHISTLE = new Identifier(WhistleModFabric.MOD_ID, "whistle");

    public static void register() {
        ServerPlayNetworking.registerGlobalReceiver(WHISTLE, (server, player, handler, buf, sender) -> {
            server.execute(() -> {
                Inventory inventory = player.getInventory();
                if (inventory.containsAny(Set.of(WhistleModItems.WHISTLE))) {
                    if (!player.getItemCooldownManager().isCoolingDown(WhistleModItems.WHISTLE))
                    Whistle.use(player.getWorld(), player, (ItemWhistle) WhistleModItems.WHISTLE);
                }
            });
        });
    }
}
