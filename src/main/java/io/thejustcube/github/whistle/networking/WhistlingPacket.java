package io.thejustcube.github.whistle.networking;

import io.thejustcube.github.whistle.WhistleModFabric;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;

public record WhistlingPacket() implements CustomPayload {
    public static final Id ID = new Id<>(new Identifier(WhistleModFabric.MOD_ID, "whistling"));
    public static final PacketCodec<PacketByteBuf, WhistlingPacket> PACKET_CODEC = PacketCodec.ofStatic(WhistlingPacket::write, WhistlingPacket::new);

    public WhistlingPacket(PacketByteBuf buf) {
        this();
    }

    @Override
    public Id getId() {
        return ID;
    }
    
    public static void write(PacketByteBuf buf, WhistlingPacket packet) {

    }
}
