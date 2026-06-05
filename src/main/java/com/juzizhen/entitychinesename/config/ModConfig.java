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
    public int twoCharacterNameChance = 20;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int threeCharacterNameChance = 75;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int fourCharacterNameChance = 5;

    // 姓氏类型概率
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int threeCharSingleSurnameChance = 95;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int threeCharDoubleSurnameChance = 5;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int fourCharSingleSurnameChance = 40;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int fourCharDoubleSurnameChance = 60;

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
    public List<String> excludedEntityLists = NameListManager.getDefaultexcludedListsString();

    // 姓氏配置
    @CollapsibleObject
    public SurnameLists surnameLists = new SurnameLists();

    public static class SurnameLists {
        @ConfigEntry.Gui.Tooltip
        public String singleSurnames = NameListManager.getDefaultSingleSurnamesString();

        @ConfigEntry.Gui.Tooltip
        public String doubleSurnames = NameListManager.getDefaultDoubleSurnamesString();
    }

    // 男性名字配置
    @CollapsibleObject
    public MaleNameLists maleNameLists = new MaleNameLists();

    public static class MaleNameLists {
        @ConfigEntry.Gui.Tooltip
        public String maleName1 = NameListManager.getDefaultMaleName1String();

        @ConfigEntry.Gui.Tooltip
        public String maleName2 = NameListManager.getDefaultMaleName2String();
    }

    // 女性名字配置
    @CollapsibleObject
    public FemaleNameLists femaleNameLists = new FemaleNameLists();

    public static class FemaleNameLists {
        @ConfigEntry.Gui.Tooltip
        public String femaleName1 = NameListManager.getDefaultFemaleName1String();

        @ConfigEntry.Gui.Tooltip
        public String femaleName2 = NameListManager.getDefaultFemaleName2String();
    }

    // 自定义姓名配置
    @CollapsibleObject
    public CustomNameLists customNameLists = new CustomNameLists();

    public static class CustomNameLists {
        @ConfigEntry.Gui.Tooltip
        @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
        public int customNameChance = 5;

        @ConfigEntry.Gui.Tooltip
        public String customName = "";
    }
}