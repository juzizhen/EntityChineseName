package com.juzizhen.entitychinesename.mixin;

import com.juzizhen.entitychinesename.config.ConfigManager;
import com.juzizhen.entitychinesename.generator.ChineseNameGenerator;
import com.juzizhen.entitychinesename.util.EntityFilter;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MobEntity.class)
public abstract class EnderDragonEntityMixin {

    @Inject(method = "<init>(Lnet/minecraft/entity/EntityType;Lnet/minecraft/world/World;)V", at = @At("TAIL"))
    private void onEntitySpawn(EntityType<?> entityType, World world, CallbackInfo ci) {
        if (!world.isClient) {
            MobEntity mobEntity = (MobEntity) (Object) this;
            var config = ConfigManager.getConfig();

            // 检查实体是否应该被命名
            if (EntityFilter.shouldNameEntity(mobEntity, config)) {
                // 检查实体是否已经有自定义名称
                if (!mobEntity.hasCustomName()) {
                    // 使用世界的随机数生成器
                    String chineseName = ChineseNameGenerator.generateRandomName();

                    // 设置自定义名称
                    if (mobEntity instanceof EnderDragonEntity) {
                        mobEntity.setCustomName(Text.literal(chineseName));
                    }

                    // 可选：记录日志
                    com.juzizhen.entitychinesename.EntityChineseName.LOGGER.debug("实体 {} 被命名为: {}",
                            EntityType.getId(mobEntity.getType()), chineseName);
                }
            }
        }
    }
}

