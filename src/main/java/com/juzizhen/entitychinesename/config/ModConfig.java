package com.juzizhen.entitychinesename.config;

import com.juzizhen.entitychinesename.manager.NameListManager;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.CollapsibleObject;

import java.util.List;

@Config(name = "entitychinesename")
public class ModConfig implements ConfigData {

    // 配置版本 - 不显示在GUI中，用于配置迁移
    @ConfigEntry.Gui.Excluded
    public String configVersion = NameListManager.MOD_VERSION;

    // 名字长度概率
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int twoCharacterNameChance = 30;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int threeCharacterNameChance = 60;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int fourCharacterNameChance = 10;

    // 姓氏类型概率
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int threeCharSingleSurnameChance = 50;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int threeCharDoubleSurnameChance = 50;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int fourCharSingleSurnameChance = 30;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int fourCharDoubleSurnameChance = 70;

    // 性别概率
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int maleChance = 50;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int femaleChance = 50;

    // 实体类型设置
    @ConfigEntry.Gui.Tooltip
    public boolean enableForPassiveMobs = true;

    @ConfigEntry.Gui.Tooltip
    public boolean enableForHostileMobs = true;

    @ConfigEntry.Gui.Tooltip
    public List<String> excludedEntityLists = NameListManager.DEFAULT_EXCLUDED;

    // 姓氏配置
    @CollapsibleObject
    public SurnameLists surnameLists = new SurnameLists();

    public static class SurnameLists {
        @ConfigEntry.Gui.Tooltip
        public String singleSurnames = String.join(",", NameListManager.DEFAULT_SINGLE_SURNAMES);

        @ConfigEntry.Gui.Tooltip
        public String doubleSurnames = String.join(",", NameListManager.DEFAULT_DOUBLE_SURNAMES);
    }

    // 男性名字配置
    @CollapsibleObject
    public MaleNameLists maleNameLists = new MaleNameLists();

    public static class MaleNameLists {
        @ConfigEntry.Gui.Tooltip
        public String maleName1 = String.join(",", NameListManager.DEFAULT_MALE_NAME1);

        @ConfigEntry.Gui.Tooltip
        public String maleName2 = String.join(",", NameListManager.DEFAULT_MALE_NAME2);
    }

    // 女性名字配置
    @CollapsibleObject
    public FemaleNameLists femaleNameLists = new FemaleNameLists();

    public static class FemaleNameLists {
        @ConfigEntry.Gui.Tooltip
        public String femaleName1 = String.join(",", NameListManager.DEFAULT_FEMALE_NAME1);

        @ConfigEntry.Gui.Tooltip
        public String femaleName2 = String.join(",", NameListManager.DEFAULT_FEMALE_NAME2);
    }
}