package io.github.sjouwer.dontdisappear;

import me.sargunvohra.mcmods.autoconfig1u.ConfigHolder;
import net.fabricmc.api.ClientModInitializer;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import io.github.sjouwer.dontdisappear.config.ModConfig;

public class DontDisappear implements ClientModInitializer {
    private static ConfigHolder<ModConfig> configHolder;

    public static ModConfig getConfig() {
        return configHolder.getConfig();
    }

    @Override
    public void onInitializeClient() {
        configHolder = AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new);
    }
}
