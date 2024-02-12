package io.rensatopc.github.rensato_whistle.registers;

import io.rensatopc.github.rensato_whistle.WhistleModFabric;
import io.rensatopc.github.rensato_whistle.blocks.items.BlockItemWhistle;
import io.rensatopc.github.rensato_whistle.items.ItemWhistle;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WhistleModItems {
    public static final Item WHISTLE = new ItemWhistle();
    public static final BlockItem WHISTLE_BLOCK = new BlockItemWhistle(WhistleModBlocks.WHISTLE_BLOCK);

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(WhistleModFabric.MOD_ID, "whistle"), WHISTLE);
        Registry.register(Registries.ITEM, new Identifier(WhistleModFabric.MOD_ID, "whistle_block"), WHISTLE_BLOCK);
    }
}
