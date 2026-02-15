package com.juzizhen.entitychinesename.util;

import com.juzizhen.entitychinesename.config.ModConfig;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.PassiveEntity;

public class EntityFilter {

    public static boolean shouldNameEntity(LivingEntity entity, ModConfig config) {
        // 检查排除列表
        if (isExcluded(entity, config)) {
            return false;
        }

        // 根据实体类型检查
        if (entity instanceof PassiveEntity) {
            return config.enableForPassiveMobs;
        } else if (entity instanceof HostileEntity) {
            return config.enableForHostileMobs;
        }
        return true;
    }

    private static boolean isExcluded(LivingEntity entity, ModConfig config) {
        if (config.excludedEntityLists == null || config.excludedEntityLists.isEmpty()) {
            return false;
        }

        String entityId = net.minecraft.entity.EntityType.getId(entity.getType()).toString();

        return config.excludedEntityLists.stream().map(String::trim).anyMatch(id -> id.equals(entityId));
    }
}