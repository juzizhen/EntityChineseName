package com.juzizhen.entitychinesename.manager;

import com.juzizhen.entitychinesename.EntityChineseName;
import com.juzizhen.entitychinesename.config.ConfigManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameListManager {

    // MOD版本 - 与build.gradle中的版本保持一致
    public static final String MOD_VERSION = "1.0.0";

    // 默认单姓列表
    private static final List<String> DEFAULT_SINGLE_SURNAMES = Arrays.asList(
            "安", "白", "柏", "毕", "蔡", "曹", "常", "昌", "陈", "程",
            "崔", "戴", "丁", "董", "杜", "段", "窦", "方", "范", "费",
            "凤", "付", "傅", "葛", "高", "龚", "顾", "关", "郭", "韩",
            "何", "侯", "胡", "华", "黄", "贾", "姜", "江", "金", "孔",
            "赖", "郎", "黎", "李", "梁", "林", "刘", "柳", "卢", "陆",
            "鲁", "吕", "马", "毛", "孟", "苗", "莫", "母", "穆", "倪",
            "聂", "潘", "彭", "钱", "强", "秦", "邱", "邵", "沈", "史",
            "石", "施", "宋", "苏", "孙", "谭", "汤", "唐", "陶", "田",
            "滕", "万", "王", "韦", "卫", "魏", "吴", "武", "夏", "萧",
            "谢", "辛", "邢", "熊", "徐", "许", "薛", "严", "杨", "姚",
            "叶", "易", "尤", "于", "余", "俞", "袁", "元", "喻", "臧",
            "张", "章", "赵", "郑", "钟", "周", "朱", "邹", "褚", "柴",
            "常", "昌", "洪", "侯", "胡", "贺", "郝", "邬", "覃", "赖",
            "闫", "郎", "黎", "龙", "莫", "向", "云"
    );

    // 默认复姓列表
    private static final List<String> DEFAULT_DOUBLE_SURNAMES = Arrays.asList(
            "东方", "端木", "公孙", "慕容", "南宫", "欧阳", "司马", "司徒",
            "夏侯", "西门", "轩辕", "上官", "尉迟", "宇文", "长孙", "诸葛",
            "令狐"
    );

    // 默认男性名字1列表
    private static final List<String> DEFAULT_MALE_NAME1 = Arrays.asList(
            "安", "邦", "博", "昌", "辰", "宸", "大", "德", "丰", "富",
            "福", "光", "国", "浩", "航", "和", "弘", "华", "吉", "家",
            "建", "杰", "景", "礼", "良", "朗", "立", "宁", "年", "平",
            "祺", "强", "仁", "荣", "瑞", "世", "沂", "盛", "寿", "晟",
            "孝", "祥", "信", "兴", "旭", "熙", "义", "永", "运", "云",
            "哲", "兆", "之", "智", "忠", "煜", "子", "泽", "昊", "昱",
            "阳", "扬", "一", "恺", "康", "然", "霖", "琛", "天", "全",
            "轩", "睿", "烨", "宇", "晟", "朗", "春", "紫", "小", "思"
            );

    // 默认男性名字2列表
    private static final List<String> DEFAULT_MALE_NAME2 = Arrays.asList(
            "伟", "强", "磊", "勇", "军", "波", "涛", "斌", "超", "杰",
            "鹏", "飞", "亮", "明", "健", "康", "宏", "达", "翔", "宇",
            "峰", "平", "东", "文", "辉", "力", "成", "诚", "林", "洋",
            "山", "钧", "钊", "锋", "铭", "镇", "锐", "锦", "钢", "铁",
            "铮", "铠", "铖", "鑫", "森", "淼", "焱", "垚", "臻",  "昌",
            "云", "祎", "哲"
            );

    // 默认女性名字1列表
    private static final List<String> DEFAULT_FEMALE_NAME1 = Arrays.asList(
            "雅", "诗", "雨", "梦", "雪", "琳", "婷", "欣", "怡", "悦",
            "妍", "莹", "雯", "婕", "璐", "璇", "娅", "妮", "萌", "芊",
            "芸", "菲", "萱", "蕾", "薇", "嫣", "姝", "妤", "嫚", "姗",
            "娆", "娉", "婵", "娟", "娜", "媚", "婉", "娴", "娇", "娥",
            "妲", "嫔", "媛", "月", "星", "晴", "虹", "霞", "露", "霜",
            "冰", "清", "溪", "河", "海", "洋", "波", "浪", "潮", "汐",
            "汀", "澜", "漪", "涟", "涓", "洁", "净", "澄", "澈", "潋",
            "滟", "湉", "沁", "润", "泽", "涵", "潇", "洒", "沐", "浴",
            "浣", "淅", "淋", "渺", "漫", "漾", "湛", "澳", "源", "渊",
            "思"
            );

    // 默认女性名字2列表
    private static final List<String> DEFAULT_FEMALE_NAME2 = Arrays.asList(
            "丽", "芳", "娜", "敏", "静", "秀", "英", "华", "慧", "巧",
            "美", "玉", "兰", "萍", "红", "玲", "春", "燕", "芬", "洁",
            "琼", "莹", "茜", "倩", "妍", "婷", "姣", "婉", "娴", "淑",
            "惠", "珠", "翠", "雅", "芝", "娟", "嫣", "娥", "婵", "薇",
            "蕊", "馥", "馨", "韵", "融", "园", "艺", "咏", "卿", "聪",
            "雯", "臻"
            );

    // 缓存的姓名列表
    private static List<String> cachedSingleSurnames = null;
    private static List<String> cachedDoubleSurnames = null;
    private static List<String> cachedMaleName1 = null;
    private static List<String> cachedMaleName2 = null;
    private static List<String> cachedFemaleName1 = null;
    private static List<String> cachedFemaleName2 = null;

    /**
     * 初始化缓存并检查版本
     */
    public static void initializeCache() {
        try {
            // 先检查版本并迁移整个配置
            checkAndMigrateFullConfig();

            // 然后刷新缓存
            refreshCache();

        } catch (Exception e) {
            EntityChineseName.LOGGER.error("初始化姓名列表缓存时出错", e);
            loadDefaults();
        }
    }

    /**
     * 检查并完整迁移整个配置
     */
    private static void checkAndMigrateFullConfig() {
        try {
            var configHolder = ConfigManager.getConfigHolder();
            var config = configHolder.getConfig();
            String configVersion = config.configVersion;

            // 如果配置版本为空或低于MOD版本，则执行完整迁移
            if (configVersion == null || configVersion.isEmpty() ||
                    compareVersions(MOD_VERSION, configVersion) > 0) {

                EntityChineseName.LOGGER.info("检测到配置版本 {} 低于MOD版本 {}，执行完整配置迁移",
                        configVersion, MOD_VERSION);

                // 执行完整配置迁移（覆盖所有配置）
                migrateFullConfig(config);

                // 保存配置（只保存一次）
                configHolder.save();

                EntityChineseName.LOGGER.info("完整配置迁移完成");
            }

        } catch (Exception e) {
            EntityChineseName.LOGGER.error("检查配置版本时出错", e);
        }
    }

    /**
     * 比较版本号
     * @return 1: v1 > v2, 0: v1 == v2, -1: v1 < v2
     */
    private static int compareVersions(String v1, String v2) {
        if (v1 == null || v2 == null) {
            return 1; // 如果任一版本为空，认为需要迁移
        }

        try {
            String[] parts1 = v1.split("\\.");
            String[] parts2 = v2.split("\\.");

            int length = Math.max(parts1.length, parts2.length);
            for (int i = 0; i < length; i++) {
                int num1 = i < parts1.length ? Integer.parseInt(parts1[i]) : 0;
                int num2 = i < parts2.length ? Integer.parseInt(parts2[i]) : 0;

                if (num1 != num2) {
                    return Integer.compare(num1, num2);
                }
            }
            return 0;
        } catch (Exception e) {
            EntityChineseName.LOGGER.warn("版本比较出错，执行迁移", e);
            return 1; // 出错时执行迁移
        }
    }

    /**
     * 迁移完整配置（覆盖所有配置项）
     */
    private static void migrateFullConfig(com.juzizhen.entitychinesename.config.ModConfig config) {
        // 更新配置版本
        config.configVersion = MOD_VERSION;

        // 重置所有概率设置
        config.twoCharacterNameChance = 30;
        config.threeCharacterNameChance = 50;
        config.fourCharacterNameChance = 20;
        config.threeCharSingleSurnameChance = 50;
        config.threeCharDoubleSurnameChance = 50;
        config.fourCharSingleSurnameChance = 30;
        config.fourCharDoubleSurnameChance = 70;

        // 重置性别概率设置
        config.maleChance = 50;
        config.femaleChance = 50;

        // 重置实体类型设置
        config.enableForPassiveMobs = true;
        config.enableForHostileMobs = true;
        config.enableForNeutralMobs = true;
        config.enableForBossMobs = false;
        config.excludeEnderDragon = true;
        config.excludedEntities = "minecraft:ender_dragon";

        // 重置姓名列表
        config.surnameLists.singleSurnames = getDefaultSingleSurnamesString();
        config.surnameLists.doubleSurnames = getDefaultDoubleSurnamesString();
        config.maleNameLists.maleName1 = getDefaultMaleName1String();
        config.maleNameLists.maleName2 = getDefaultMaleName2String();
        config.femaleNameLists.femaleName1 = getDefaultFemaleName1String();
        config.femaleNameLists.femaleName2 = getDefaultFemaleName2String();

        EntityChineseName.LOGGER.info("已重置所有配置到默认值");
    }

    /**
     * 刷新缓存（从配置读取）
     */
    public static void refreshCache() {
        try {
            var config = ConfigManager.getConfig();

            // 处理单姓列表
            cachedSingleSurnames = parseCommaSeparatedList(config.surnameLists.singleSurnames);

            // 处理复姓列表
            cachedDoubleSurnames = parseCommaSeparatedList(config.surnameLists.doubleSurnames);

            // 处理男性名字1列表
            cachedMaleName1 = parseCommaSeparatedList(config.maleNameLists.maleName1);

            // 处理男性名字2列表
            cachedMaleName2 = parseCommaSeparatedList(config.maleNameLists.maleName2);

            // 处理女性名字1列表
            cachedFemaleName1 = parseCommaSeparatedList(config.femaleNameLists.femaleName1);

            // 处理女性名字2列表
            cachedFemaleName2 = parseCommaSeparatedList(config.femaleNameLists.femaleName2);

            EntityChineseName.LOGGER.debug("姓名列表缓存已刷新 - 单姓: {}, 复姓: {}, 男名1: {}, 男名2: {}, 女名1: {}, 女名2: {}",
                    cachedSingleSurnames.size(), cachedDoubleSurnames.size(),
                    cachedMaleName1.size(), cachedMaleName2.size(),
                    cachedFemaleName1.size(), cachedFemaleName2.size());

        } catch (Exception e) {
            EntityChineseName.LOGGER.error("刷新姓名列表缓存时出错，使用默认值", e);
            loadDefaults();
        }
    }

    /**
     * 加载默认值
     */
    private static void loadDefaults() {
        cachedSingleSurnames = getDefaultSingleSurnames();
        cachedDoubleSurnames = getDefaultDoubleSurnames();
        cachedMaleName1 = getDefaultMaleName1();
        cachedMaleName2 = getDefaultMaleName2();
        cachedFemaleName1 = getDefaultFemaleName1();
        cachedFemaleName2 = getDefaultFemaleName2();
    }

    /**
     * 解析逗号分隔的字符串为列表
     */
    private static List<String> parseCommaSeparatedList(String str) {
        if (str == null || str.trim().isEmpty()) {
            return Collections.emptyList();
        }

        try {
            return Arrays.stream(str.split(","))
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .toList();
        } catch (Exception e) {
            EntityChineseName.LOGGER.warn("解析姓名列表失败，使用默认值", e);
            return Collections.emptyList();
        }
    }

    /**
     * 获取单姓列表
     */
    public static List<String> getSingleSurnames() {
        if (cachedSingleSurnames == null) {
            refreshCache();
        }
        return cachedSingleSurnames;
    }

    /**
     * 获取复姓列表
     */
    public static List<String> getDoubleSurnames() {
        if (cachedDoubleSurnames == null) {
            refreshCache();
        }
        return cachedDoubleSurnames;
    }

    /**
     * 获取男性名字1列表
     */
    public static List<String> getMaleName1() {
        if (cachedMaleName1 == null) {
            refreshCache();
        }
        return cachedMaleName1;
    }

    /**
     * 获取男性名字2列表
     */
    public static List<String> getMaleName2() {
        if (cachedMaleName2 == null) {
            refreshCache();
        }
        return cachedMaleName2;
    }

    /**
     * 获取女性名字1列表
     */
    public static List<String> getFemaleName1() {
        if (cachedFemaleName1 == null) {
            refreshCache();
        }
        return cachedFemaleName1;
    }

    /**
     * 获取女性名字2列表
     */
    public static List<String> getFemaleName2() {
        if (cachedFemaleName2 == null) {
            refreshCache();
        }
        return cachedFemaleName2;
    }

    /**
     * 获取默认的单姓列表
     */
    public static List<String> getDefaultSingleSurnames() {
        return DEFAULT_SINGLE_SURNAMES;
    }

    /**
     * 获取默认的复姓列表
     */
    public static List<String> getDefaultDoubleSurnames() {
        return DEFAULT_DOUBLE_SURNAMES;
    }

    /**
     * 获取默认男性名字1列表
     */
    public static List<String> getDefaultMaleName1() {
        return DEFAULT_MALE_NAME1;
    }

    /**
     * 获取默认男性名字2列表
     */
    public static List<String> getDefaultMaleName2() {
        return DEFAULT_MALE_NAME2;
    }

    /**
     * 获取默认女性名字1列表
     */
    public static List<String> getDefaultFemaleName1() {
        return DEFAULT_FEMALE_NAME1;
    }

    /**
     * 获取默认女性名字2列表
     */
    public static List<String> getDefaultFemaleName2() {
        return DEFAULT_FEMALE_NAME2;
    }

    /**
     * 获取默认单姓字符串（逗号分隔）
     */
    public static String getDefaultSingleSurnamesString() {
        return String.join(",", DEFAULT_SINGLE_SURNAMES);
    }

    /**
     * 获取默认复姓字符串（逗号分隔）
     */
    public static String getDefaultDoubleSurnamesString() {
        return String.join(",", DEFAULT_DOUBLE_SURNAMES);
    }

    /**
     * 获取默认男性名字1字符串（逗号分隔）
     */
    public static String getDefaultMaleName1String() {
        return String.join(",", DEFAULT_MALE_NAME1);
    }

    /**
     * 获取默认男性名字2字符串（逗号分隔）
     */
    public static String getDefaultMaleName2String() {
        return String.join(",", DEFAULT_MALE_NAME2);
    }

    /**
     * 获取默认女性名字1字符串（逗号分隔）
     */
    public static String getDefaultFemaleName1String() {
        return String.join(",", DEFAULT_FEMALE_NAME1);
    }

    /**
     * 获取默认女性名字2字符串（逗号分隔）
     */
    public static String getDefaultFemaleName2String() {
        return String.join(",", DEFAULT_FEMALE_NAME2);
    }

    /**
     * 获取MOD版本
     */
    public static String getModVersion() {
        return MOD_VERSION;
    }

    /**
     * 获取配置版本
     */
    public static String getConfigVersion() {
        try {
            return ConfigManager.getConfig().configVersion;
        } catch (Exception e) {
            return "unknown";
        }
    }

    /**
     * 重置整个配置到默认值（用于ModMenu中的重置按钮）
     */
    public static void resetFullConfig() {
        try {
            var configHolder = ConfigManager.getConfigHolder();
            var config = configHolder.getConfig();

            // 执行完整配置重置
            migrateFullConfig(config);

            // 保存配置
            configHolder.save();

            // 刷新缓存
            refreshCache();

            EntityChineseName.LOGGER.info("已通过重置按钮重置所有配置");

        } catch (Exception e) {
            EntityChineseName.LOGGER.error("重置配置时出错", e);
        }
    }
}