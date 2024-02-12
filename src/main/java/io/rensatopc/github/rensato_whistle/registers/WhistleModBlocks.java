package io.rensatopc.github.rensato_whistle.registers;

import io.rensatopc.github.rensato_whistle.WhistleModFabric;
import io.rensatopc.github.rensato_whistle.blocks.BlockWhistle;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WhistleModBlocks {
    public static final Block WHISTLE_BLOCK = new BlockWhistle();

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(WhistleModFabric.MOD_ID, "whistle_block"), WHISTLE_BLOCK);
    }
}
