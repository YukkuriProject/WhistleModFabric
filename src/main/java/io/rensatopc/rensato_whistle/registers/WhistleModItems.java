package io.rensatopc.rensato_whistle.registers;

import io.rensatopc.rensato_whistle.WhistleModFabric;
import io.rensatopc.rensato_whistle.items.ItemWhistle;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WhistleModItems {
    public static final Item WHISTLE = new ItemWhistle();

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(WhistleModFabric.MOD_ID, "whistle"), WHISTLE);
    }
}
