package io.rensatopc.github.rensato_whistle;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeyBinds {
    public static final String MOD_KEY_CATEGORY = "key.category.rensato_whistle.main";
    public static final String WHISTLING_KEY_ID = "key.rensato_whistle.whistling";

    public static final KeyBinding WHISTLING_KEY = new KeyBinding(WHISTLING_KEY_ID, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_Y, MOD_KEY_CATEGORY);
}
