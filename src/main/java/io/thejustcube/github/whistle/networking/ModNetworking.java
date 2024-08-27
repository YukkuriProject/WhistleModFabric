package io.thejustcube.github.whistle.networking;

import io.thejustcube.github.whistle.WhistleModFabric;
import io.thejustcube.github.whistle.items.ItemWhistle;
import io.thejustcube.github.whistle.registers.WhistleModItems;
import io.thejustcube.github.whistle.util.Whistle;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.inventory.Inventory;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.Uuids;

import java.util.Set;

public class ModNetworking {

    public static void register() {
        PayloadTypeRegistry.playC2S().register(WhistlingPacket.ID, WhistlingPacket.PACKET_CODEC);

        ServerPlayNetworking.registerGlobalReceiver(WhistlingPacket.ID, (payload, context) -> {
            MinecraftServer server = context.server();
            ServerPlayerEntity player = context.player();
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
