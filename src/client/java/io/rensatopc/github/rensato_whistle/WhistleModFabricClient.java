package io.rensatopc.github.rensato_whistle;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.FabricKeyBinding;
import net.fabricmc.fabric.api.client.keybinding.KeyBindingRegistry;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.impl.client.keybinding.KeyBindingRegistryImpl;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.option.KeybindsScreen;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class WhistleModFabricClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		KeyBindingRegistryImpl.registerKeyBinding(KeyBinds.WHISTLING_KEY);
		Events.register();
	}
}