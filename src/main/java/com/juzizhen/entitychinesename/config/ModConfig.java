package com.juzizhen.entitychinesename.config;

import com.juzizhen.entitychinesename.manager.NameListManager;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.CollapsibleObject;

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
    public int threeCharacterNameChance = 50;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public int fourCharacterNameChance = 20;

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
    public boolean enableForNeutralMobs = true;

    @ConfigEntry.Gui.Tooltip
    public boolean enableForBossMobs = false;

    @ConfigEntry.Gui.Tooltip
    public boolean excludeEnderDragon = true;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Gui.Excluded
    public String excludedEntities = "minecraft:ender_dragon";

    // 姓氏配置
    @CollapsibleObject
    public SurnameLists surnameLists = new SurnameLists();

    public static class SurnameLists {
        @ConfigEntry.Gui.Tooltip
        public String singleSurnames = "赵,钱,孙,李,周,吴,郑,王,冯,陈,褚,卫,蒋,沈,韩,杨,朱,秦,尤,许,何,吕,施,张,孔,曹,严,华,金,魏,陶,姜,戚,谢,邹,喻,柏,水,窦,章,云,苏,潘,葛,奚,范,彭,郎,鲁,韦,昌,马,苗,凤,花,方,俞,任,袁,柳,酆,鲍,史,唐,费,廉,岑,薛,雷,贺,倪,汤,滕,殷,罗,毕,郝,邬,安,常";

        @ConfigEntry.Gui.Tooltip
        public String doubleSurnames = "欧阳,上官,司徒,司马,诸葛,夏侯,东方,西门,南宫,轩辕,令狐,慕容,宇文,尉迟";
    }

    // 男性名字配置
    @CollapsibleObject
    public MaleNameLists maleNameLists = new MaleNameLists();

    public static class MaleNameLists {
        @ConfigEntry.Gui.Tooltip
        public String maleName1 = "勇,强,伟,磊,军,涛,杰,超,刚,明,龙,虎,文,武,斌,博,智,仁,义,德,才,华,荣,富,贵,安,康,庆,祥,福";

        @ConfigEntry.Gui.Tooltip
        public String maleName2 = "峰,海,波,江,河,山,林,森,岩,石,飞,翔,宇,宙,星,辰,光,辉,耀,煌,成,功,胜,利,发,达,兴,旺,盛,隆";
    }

    // 女性名字配置
    @CollapsibleObject
    public FemaleNameLists femaleNameLists = new FemaleNameLists();

    public static class FemaleNameLists {
        @ConfigEntry.Gui.Tooltip
        public String femaleName1 = "芳,娜,敏,静,丽,娟,霞,红,雪,梅,兰,竹,菊,花,玉,珠,珍,宝,凤,凰,雅,慧,秀,英,美,娇,婉,柔,淑,惠";

        @ConfigEntry.Gui.Tooltip
        public String femaleName2 = "婷,雯,玲,琳,瑶,琼,莹,晶,洁,纯,艳,香,芬,馨,怡,悦,欣,欢,乐,爱,情,思,念,梦,幻,月,星,云,雨,露";
    }
}