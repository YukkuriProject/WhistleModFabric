package io.rensatopc.github.rensato_whistle;

import io.rensatopc.github.rensato_whistle.networking.ModNetworking;
import io.rensatopc.github.rensato_whistle.registers.WhistleModItems;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.client.MinecraftClient;
import net.minecraft.inventory.Inventory;

import java.util.Set;

public class Events {
    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register((client) -> {
            if (KeyBinds.WHISTLING_KEY.wasPressed()) {
                if (MinecraftClient.getInstance().player != null) {
                    ClientPlayNetworking.send(ModNetworking.WHISTLE, PacketByteBufs.create());
                }
            }
        });
    }
}
