package io.rensatopc.rensato_whistle.registers.tab;

import io.rensatopc.rensato_whistle.WhistleModFabric;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WhistleModItemGroups {
    public static final ItemGroup MAIN_TAB = WhistleModMainTab.get();

    public static void register() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(WhistleModFabric.MOD_ID, "whistlemod"), MAIN_TAB);
    }
}
