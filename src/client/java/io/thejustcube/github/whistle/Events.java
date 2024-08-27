package io.thejustcube.github.whistle;

import io.thejustcube.github.whistle.networking.ModNetworking;
import io.thejustcube.github.whistle.networking.WhistlingPacket;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.option.KeybindsScreen;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.packet.CustomPayload;

public class Events {
    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register((client) -> {
            if (KeyBinds.WHISTLING_KEY.wasPressed()) {
                if (MinecraftClient.getInstance().player != null) {
                    ClientPlayNetworking.send(new WhistlingPacket(PacketByteBufs.create()));
                }
            }
        });
    }
}
