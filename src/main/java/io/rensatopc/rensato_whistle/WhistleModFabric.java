package io.rensatopc.rensato_whistle;

import io.rensatopc.rensato_whistle.registers.WhistleModBlocks;
import io.rensatopc.rensato_whistle.registers.WhistleModItems;
import io.rensatopc.rensato_whistle.registers.WhistleModSounds;
import io.rensatopc.rensato_whistle.registers.tab.WhistleModItemGroups;
import net.fabricmc.api.ModInitializer;

public class WhistleModFabric implements ModInitializer {
	public static final String MOD_ID = "rensato_whistle";

	@Override
	public void onInitialize() {
		WhistleModItemGroups.register();
		WhistleModItems.register();
		WhistleModSounds.register();
		WhistleModBlocks.register();
	}
}