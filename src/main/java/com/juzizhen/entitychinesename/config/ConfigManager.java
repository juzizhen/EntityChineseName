package com.juzizhen.entitychinesename.config;

import com.juzizhen.entitychinesename.manager.NameListManager;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

public class ConfigManager {
    private static ConfigHolder<ModConfig> configHolder;

    public static void loadConfig() {
        // 注册配置
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);

        // 获取配置持有者
        configHolder = AutoConfig.getConfigHolder(ModConfig.class);

        // 初始化姓名列表缓存（包括版本检查和完整配置迁移）
        NameListManager.initializeCache();

        com.juzizhen.entitychinesename.EntityChineseName.LOGGER.info("配置加载完成 - MOD版本: {}, 配置版本: {}",
                NameListManager.getModVersion(), NameListManager.getConfigVersion());
    }

    public static ModConfig getConfig() {
        return configHolder.getConfig();
    }

    public static ConfigHolder<ModConfig> getConfigHolder() {
        return configHolder;
    }

}