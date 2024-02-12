package io.rensatopc.github.rensato_whistle.blocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemWhistle extends BlockItem {
    public BlockItemWhistle(Block block) {
        super(block, new Settings().fireproof());
    }
}
