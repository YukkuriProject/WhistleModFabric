package io.rensatopc.github.rensato_whistle.registers;

import io.rensatopc.github.rensato_whistle.WhistleModFabric;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class WhistleModSounds {
    public static final SoundEvent WHISTLE_CLICK = SoundEvent.of(new Identifier(WhistleModFabric.MOD_ID, "whistle_click"));

    public static void register() {
        Registry.register(Registries.SOUND_EVENT, WHISTLE_CLICK.getId(), WHISTLE_CLICK);
    }
}
