package io.thejustcube.github.whistle;

import io.thejustcube.github.whistle.networking.ModNetworking;
import io.thejustcube.github.whistle.registers.WhistleModBlocks;
import io.thejustcube.github.whistle.registers.WhistleModItems;
import io.thejustcube.github.whistle.registers.WhistleModSounds;
import io.thejustcube.github.whistle.registers.tab.WhistleModItemGroups;
import net.fabricmc.api.ModInitializer;

public class WhistleModFabric implements ModInitializer {
	public static final String MOD_ID = "whistle";

	@Override
	public void onInitialize() {
		WhistleModItemGroups.register();
		WhistleModItems.register();
		WhistleModSounds.register();
		WhistleModBlocks.register();
		ModNetworking.register();
	}
}