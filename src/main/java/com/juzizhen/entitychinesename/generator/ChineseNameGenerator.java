package com.juzizhen.entitychinesename.generator;

import com.juzizhen.entitychinesename.config.ConfigManager;
import com.juzizhen.entitychinesename.config.ModConfig;
import com.juzizhen.entitychinesename.manager.NameListManager;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ChineseNameGenerator {

    /**
     * 生成随机中文名
     */
    public static String generateRandomName() {
        var config = ConfigManager.getConfig();
        var random = ThreadLocalRandom.current();

        // 从姓名管理器获取列表
        List<String> singleSurnames = NameListManager.getSingleSurnames();
        List<String> doubleSurnames = NameListManager.getDoubleSurnames();
        List<String> maleName1 = NameListManager.getMaleName1();
        List<String> maleName2 = NameListManager.getMaleName2();
        List<String> femaleName1 = NameListManager.getFemaleName1();
        List<String> femaleName2 = NameListManager.getFemaleName2();

        // 检查列表是否有效
        if (singleSurnames.isEmpty() || maleName1.isEmpty() || maleName2.isEmpty() ||
                femaleName1.isEmpty() || femaleName2.isEmpty()) {
            throw new IllegalStateException("姓名列表不能为空！请检查配置文件。");
        }

        // 确定性别
        boolean isMale = determineGender(random, config);

        // 计算名字长度
        int nameLength = calculateNameLength(random, config);

        // 根据性别和长度生成名字
        if (isMale) {
            return generateMaleName(nameLength, random, config, singleSurnames, doubleSurnames, maleName1, maleName2);
        } else {
            return generateFemaleName(nameLength, random, config, singleSurnames, doubleSurnames, femaleName1, femaleName2);
        }
    }

    /**
     * 确定性别
     */
    private static boolean determineGender(ThreadLocalRandom random, com.juzizhen.entitychinesename.config.ModConfig config) {
        int totalChance = config.maleChance + config.femaleChance;
        if (totalChance <= 0) {
            return random.nextBoolean(); // 默认各一半
        }

        int randomValue = random.nextInt(totalChance);
        return randomValue < config.maleChance;
    }

    /**
     * 计算名字长度
     */
    private static int calculateNameLength(ThreadLocalRandom random, ModConfig config) {
        int totalChance = config.twoCharacterNameChance + config.threeCharacterNameChance + config.fourCharacterNameChance;

        if (totalChance <= 0) {
            return 2; // 默认两字姓名
        }

        int randomValue = random.nextInt(totalChance);

        if (randomValue < config.twoCharacterNameChance) {
            return 2;
        } else if (randomValue < config.twoCharacterNameChance + config.threeCharacterNameChance) {
            return 3;
        } else {
            return 4;
        }
    }

    /**
     * 生成男性姓名
     */
    private static String generateMaleName(int length, ThreadLocalRandom random,
                                           ModConfig config,
                                           List<String> singleSurnames, List<String> doubleSurnames,
                                           List<String> maleName1, List<String> maleName2) {

        return switch (length) {
            case 3 ->
                    generateThreeCharacterMaleName(random, config, singleSurnames, doubleSurnames, maleName1, maleName2);
            case 4 -> generateFourCharacterMaleName(random, doubleSurnames, maleName1, maleName2);
            default -> generateTwoCharacterMaleName(random, singleSurnames, maleName1, maleName2);
        };
    }

    /**
     * 生成女性姓名
     */
    private static String generateFemaleName(int length, ThreadLocalRandom random,
                                             ModConfig config,
                                             List<String> singleSurnames, List<String> doubleSurnames,
                                             List<String> femaleName1, List<String> femaleName2) {

        return switch (length) {
            case 3 ->
                    generateThreeCharacterFemaleName(random, config, singleSurnames, doubleSurnames, femaleName1, femaleName2);
            case 4 -> generateFourCharacterFemaleName(random, doubleSurnames, femaleName1, femaleName2);
            default -> generateTwoCharacterFemaleName(random, singleSurnames, femaleName1, femaleName2);
        };
    }

    /**
     * 生成两字男性姓名：单姓 + 男名1/男名2（概率各一半）
     */
    private static String generateTwoCharacterMaleName(ThreadLocalRandom random,
                                                       List<String> singleSurnames, List<String> maleName1, List<String> maleName2) {

        String surname = getRandomElement(singleSurnames, random);

        // 男名1或男名2，概率各一半
        if (random.nextBoolean()) {
            String name = getRandomElement(maleName1, random);
            return surname + name;
        } else {
            String name = getRandomElement(maleName2, random);
            return surname + name;
        }
    }

    /**
     * 生成三字男性姓名
     */
    private static String generateThreeCharacterMaleName(ThreadLocalRandom random,
                                                         com.juzizhen.entitychinesename.config.ModConfig config,
                                                         List<String> singleSurnames, List<String> doubleSurnames,
                                                         List<String> maleName1, List<String> maleName2) {

        if (random.nextInt(100) < config.threeCharSingleSurnameChance) {
            // 单姓 + 男名1 + 男名2
            String surname = getRandomElement(singleSurnames, random);
            String name1 = getRandomElement(maleName1, random);
            String name2 = getRandomElement(maleName2, random);
            return surname + name1 + name2;
        } else {
            // 复姓 + 男名1 或 复姓 + 男名2
            if (doubleSurnames.isEmpty()) {
                // 如果复姓列表为空，则使用单姓+男名1+男名2
                String surname = getRandomElement(singleSurnames, random);
                String name1 = getRandomElement(maleName1, random);
                String name2 = getRandomElement(maleName2, random);
                return surname + name1 + name2;
            }

            String doubleSurname = getRandomElement(doubleSurnames, random);
            // 男名1或男名2，概率各一半
            if (random.nextBoolean()) {
                String name = getRandomElement(maleName1, random);
                return doubleSurname + name;
            } else {
                String name = getRandomElement(maleName2, random);
                return doubleSurname + name;
            }
        }
    }

    /**
     * 生成四字男性姓名：复姓 + 男名1 + 男名2
     */
    private static String generateFourCharacterMaleName(ThreadLocalRandom random,
                                                        List<String> doubleSurnames, List<String> maleName1, List<String> maleName2) {

        if (doubleSurnames.isEmpty()) {
            // 如果复姓列表为空，返回一个默认的三字男性姓名
            return "张" + getRandomElement(maleName1, random) + getRandomElement(maleName2, random);
        }

        String doubleSurname = getRandomElement(doubleSurnames, random);
        String name1 = getRandomElement(maleName1, random);
        String name2 = getRandomElement(maleName2, random);
        return doubleSurname + name1 + name2;
    }

    /**
     * 生成两字女性姓名：单姓 + 女名1/女名2（概率各一半）
     */
    private static String generateTwoCharacterFemaleName(ThreadLocalRandom random,
                                                         List<String> singleSurnames, List<String> femaleName1, List<String> femaleName2) {

        String surname = getRandomElement(singleSurnames, random);

        // 女名1或女名2，概率各一半
        if (random.nextBoolean()) {
            String name = getRandomElement(femaleName1, random);
            return surname + name;
        } else {
            String name = getRandomElement(femaleName2, random);
            return surname + name;
        }
    }

    /**
     * 生成三字女性姓名
     */
    private static String generateThreeCharacterFemaleName(ThreadLocalRandom random,
                                                           com.juzizhen.entitychinesename.config.ModConfig config,
                                                           List<String> singleSurnames, List<String> doubleSurnames,
                                                           List<String> femaleName1, List<String> femaleName2) {

        if (random.nextInt(100) < config.threeCharSingleSurnameChance) {
            // 单姓 + 女名1 + 女名2
            String surname = getRandomElement(singleSurnames, random);
            String name1 = getRandomElement(femaleName1, random);
            String name2 = getRandomElement(femaleName2, random);
            return surname + name1 + name2;
        } else {
            // 复姓 + 女名1 或 复姓 + 女名2
            if (doubleSurnames.isEmpty()) {
                // 如果复姓列表为空，则使用单姓+女名1+女名2
                String surname = getRandomElement(singleSurnames, random);
                String name1 = getRandomElement(femaleName1, random);
                String name2 = getRandomElement(femaleName2, random);
                return surname + name1 + name2;
            }

            String doubleSurname = getRandomElement(doubleSurnames, random);
            // 女名1或女名2，概率各一半
            if (random.nextBoolean()) {
                String name = getRandomElement(femaleName1, random);
                return doubleSurname + name;
            } else {
                String name = getRandomElement(femaleName2, random);
                return doubleSurname + name;
            }
        }
    }

    /**
     * 生成四字女性姓名：复姓 + 女名1 + 女名2
     */
    private static String generateFourCharacterFemaleName(ThreadLocalRandom random,
                                                          List<String> doubleSurnames, List<String> femaleName1, List<String> femaleName2) {

        if (doubleSurnames.isEmpty()) {
            // 如果复姓列表为空，返回一个默认的三字女性姓名
            return "李" + getRandomElement(femaleName1, random) + getRandomElement(femaleName2, random);
        }

        String doubleSurname = getRandomElement(doubleSurnames, random);
        String name1 = getRandomElement(femaleName1, random);
        String name2 = getRandomElement(femaleName2, random);
        return doubleSurname + name1 + name2;
    }

    /**
     * 从列表中随机获取一个元素
     */
    private static String getRandomElement(List<String> list, ThreadLocalRandom random) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("列表不能为空！");
        }
        return list.get(random.nextInt(list.size()));
    }
}