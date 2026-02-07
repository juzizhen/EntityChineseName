package com.juzizhen.entitychinesename.manager;

import com.juzizhen.entitychinesename.EntityChineseName;
import com.juzizhen.entitychinesename.config.ConfigManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameListManager {

    // MOD版本 - 与build.gradle中的版本保持一致
    public static final String MOD_VERSION = "1.1.0";

    // 默认单姓列表
    public static final List<String> DEFAULT_SINGLE_SURNAMES = Arrays.asList(
            "安", "柏", "白", "鲍", "包", "贝", "贲", "毕", "卞", "卜",
            "蔡", "曹", "岑", "柴", "常", "昌", "陈", "成", "程", "褚",
            "崔", "戴", "单", "邓", "狄", "刁", "丁", "董", "窦", "杜",
            "段", "樊", "范", "方", "房", "费", "冯", "凤", "付", "伏",
            "傅", "干", "高", "葛", "龚", "顾", "管", "关", "郭", "韩",
            "杭", "郝", "和", "何", "贺", "洪", "侯", "胡", "华", "花",
            "黄", "霍", "纪", "计", "季", "吉", "贾", "姜", "蒋", "江",
            "解", "金", "经", "鞠", "康", "柯", "孔", "赖", "蓝", "郎",
            "乐", "雷", "黎", "李", "廉", "梁", "林", "凌", "柳", "刘",
            "龙", "娄", "陆", "路", "鲁", "卢", "骆", "罗", "吕", "马",
            "麻", "毛", "茅", "梅", "孟", "米", "苗", "闵", "明", "莫",
            "缪", "母", "穆", "倪", "聂", "钮", "潘", "庞", "彭", "皮",
            "平", "戚", "齐", "祁", "钱", "强", "秦", "裘", "邱", "屈",
            "任", "阮", "邵", "沈", "盛", "时", "施", "史", "石", "舒",
            "水", "宋", "苏", "孙", "覃", "谈", "谭", "唐", "汤", "陶",
            "滕", "田", "童", "万", "王", "汪", "卫", "危", "魏", "韦",
            "吴", "武", "邬", "伍", "席", "奚", "夏", "向", "项", "萧",
            "谢", "辛", "邢", "熊", "许", "徐", "宣", "薛", "严", "颜",
            "闫", "杨", "姚", "叶", "易", "殷", "尹", "应", "尤", "郁",
            "俞", "于", "禹", "虞", "余", "喻", "袁", "元", "云", "昝",
            "臧", "湛", "章", "张", "赵", "郑", "支", "钟", "周", "诸",
            "朱", "祝", "宗", "邹", "左"
    );

    // 默认复姓列表
    public static final List<String> DEFAULT_DOUBLE_SURNAMES = Arrays.asList(
            "东方", "端木", "公孙", "贺兰", "皇甫", "令狐", "慕容", "南宫",
            "欧阳", "上官", "申屠", "司马", "司徒", "完颜", "尉迟", "西门",
            "夏侯", "轩辕", "宇文", "长孙", "诸葛"
    );

    // 默认男性名字1列表
    public static final List<String> DEFAULT_MALE_NAME1 = Arrays.asList(
            "安", "邦", "博", "昌", "辰", "宸", "琛", "晟", "晟", "春",
            "大", "德", "丰", "富", "福", "光", "国", "航", "浩", "昊",
            "和", "弘", "华", "吉", "家", "建", "杰", "景", "恺", "康",
            "朗", "朗", "礼", "立", "良", "霖", "年", "宁", "平", "祺",
            "强", "全", "然", "仁", "荣", "瑞", "睿", "盛", "世", "寿",
            "思", "天", "熙", "祥", "孝", "小", "信", "兴", "旭", "轩",
            "阳", "扬", "烨", "沂", "义", "一", "永", "煜", "昱", "宇",
            "运", "云", "泽", "兆", "哲", "之", "智", "忠", "子", "紫"
    );

    // 默认男性名字2列表
    public static final List<String> DEFAULT_MALE_NAME2 = Arrays.asList(
            "斌", "波", "昌", "超", "成", "诚", "铖", "达", "东", "飞",
            "峰", "锋", "钢", "宏", "辉", "健", "杰", "锦", "军", "钧",
            "铠", "康", "磊", "力", "亮", "林", "淼", "明", "铭", "鹏",
            "平", "强", "锐", "森", "山", "涛", "铁", "伟", "文", "翔",
            "鑫", "焱", "洋", "垚", "祎", "勇", "宇", "云", "钊", "哲",
            "镇", "臻", "铮"
    );

    // 默认女性名字1列表
    public static final List<String> DEFAULT_FEMALE_NAME1 = Arrays.asList(
            "澳", "冰", "波", "婵", "潮", "澈", "澄", "妲", "娥", "菲",
            "海", "涵", "河", "虹", "浣", "娇", "婕", "洁", "净", "娟",
            "涓", "澜", "浪", "蕾", "涟", "潋", "琳", "淋", "璐", "露",
            "嫚", "漫", "媚", "梦", "萌", "渺", "沐", "娜", "妮", "嫔",
            "娉", "芊", "沁", "晴", "清", "娆", "润", "洒", "姗", "诗",
            "姝", "霜", "思", "湉", "婷", "汀", "婉", "薇", "雯", "溪",
            "汐", "淅", "霞", "娴", "潇", "欣", "星", "璇", "萱", "雪",
            "雅", "娅", "妍", "嫣", "滟", "洋", "漾", "怡", "漪", "莹",
            "雨", "妤", "浴", "媛", "源", "渊", "悦", "月", "芸", "泽",
            "湛"
    );

    // 默认女性名字2列表
    public static final List<String> DEFAULT_FEMALE_NAME2 = Arrays.asList(
            "婵", "春", "聪", "翠", "娥", "芳", "芬", "馥", "红", "华",
            "慧", "惠", "姣", "洁", "静", "娟", "兰", "丽", "玲", "美",
            "敏", "娜", "萍", "茜", "倩", "巧", "卿", "琼", "融", "蕊",
            "淑", "婷", "婉", "薇", "雯", "娴", "馨", "秀", "雅", "燕",
            "妍", "嫣", "艺", "英", "莹", "咏", "玉", "园", "韵", "臻",
            "芝", "珠"
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