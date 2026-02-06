package com.juzizhen.entitychinesename;

import com.juzizhen.entitychinesename.config.ConfigManager;
import com.juzizhen.entitychinesename.manager.NameListManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EntityChineseName implements ModInitializer {
	public static final String MOD_ID = "entitychinesename";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("实体中文名模组 v{} 已加载!", NameListManager.getModVersion());
		ConfigManager.loadConfig();
	}
}