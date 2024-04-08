package io.rensatopc.github.rensato_whistle;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.impl.client.keybinding.KeyBindingRegistryImpl;

public class WhistleModFabricClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		KeyBindingRegistryImpl.registerKeyBinding(KeyBinds.WHISTLING_KEY);
		Events.register();
	}
}