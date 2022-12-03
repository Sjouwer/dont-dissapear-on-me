package io.github.sjouwer.dontdisappear.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;
import net.minecraft.client.MinecraftClient;

@SuppressWarnings("FieldMayBeFinal")
@Config(name = "dont_disappear")
public class ModConfig implements ConfigData {
    @ConfigEntry.Gui.Tooltip(count = 2)
    private int blockEntityRenderDistance = 128;
    @ConfigEntry.Gui.Tooltip(count = 3)
    private boolean lockBlockEntityToViewDistance = false;

    public int squaredBlockEntityRenderDistance() {
        if (lockBlockEntityToViewDistance) {
            int viewDistance = MinecraftClient.getInstance().options.viewDistance * 16;
            return viewDistance * viewDistance;
        }
        return blockEntityRenderDistance * blockEntityRenderDistance;
    }
}
