package com.juzizhen.entitychinesename.util;

import com.juzizhen.entitychinesename.config.ModConfig;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.passive.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EntityFilter {

    public static boolean shouldNameEntity(LivingEntity entity, ModConfig config) {
        // 检查末影龙排除设置
        if (config.excludeEnderDragon && entity instanceof EnderDragonEntity) {
            return false;
        }

        // 检查排除列表
        if (isExcluded(entity, config)) {
            return false;
        }

        // 根据实体类型检查
        if (entity instanceof PassiveEntity) {
            return config.enableForPassiveMobs;
        } else if (entity instanceof HostileEntity) {
            return config.enableForHostileMobs;
        } else if (isBossMob(entity)) {
            return config.enableForBossMobs;
        }
        return true;
    }

    private static boolean isExcluded(LivingEntity entity, ModConfig config) {
        if (config.excludedEntities == null || config.excludedEntities.isEmpty()) {
            return false;
        }

        Set<String> excludedSet = new HashSet<>(Arrays.asList(config.excludedEntities.split(",")));
        String entityId = net.minecraft.entity.EntityType.getId(entity.getType()).toString();

        return excludedSet.contains(entityId.trim());
    }

    private static boolean isBossMob(LivingEntity entity) {
        return entity instanceof net.minecraft.entity.boss.WitherEntity ||
                entity instanceof EnderDragonEntity ||
                entity instanceof net.minecraft.entity.mob.ElderGuardianEntity;
    }
}