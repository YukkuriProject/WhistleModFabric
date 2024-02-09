package io.rensatopc.rensato_whistle.registers.tab;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.function.Supplier;

public class WhistleModMainTab {
    public static ItemStack[] items = ((Supplier<ItemStack[]>) () -> {
        return new ItemStack[] {

        };
    }).get();

    public static ItemGroup get() {
        ItemGroup.Builder builder = ItemGroup.create(null, -1);
        builder.displayName(Text.translatable("itemGroup.whistle_main"));
        builder.entries((c, e) -> {
            for (ItemStack itemStack:items) {
                e.add(itemStack);
            }
        });

        return builder.build();
    }
}
