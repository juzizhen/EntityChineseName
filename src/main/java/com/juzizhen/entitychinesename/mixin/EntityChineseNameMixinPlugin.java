package com.juzizhen.entitychinesename.mixin;

import net.fabricmc.loader.api.FabricLoader;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class EntityChineseNameMixinPlugin implements IMixinConfigPlugin {

    private String mcVersion;

    @Override
    public void onLoad(String mixinPackage) {
        // 获取当前 Minecraft 版本
        mcVersion = FabricLoader.getInstance()
                .getModContainer("minecraft")
                .get().getMetadata().getVersion().getFriendlyString();
    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        // 根据版本号选择性加载 Mixin
        if (mixinClassName.endsWith("MobEntityMixinOld")) {
            // 在 1.20.1 到 1.20.5 使用旧版 Mixin
            return mcVersion.startsWith("1.20.1") || mcVersion.startsWith("1.20.2") || mcVersion.startsWith("1.20.3") || mcVersion.startsWith("1.20.4") || mcVersion.startsWith("1.20.5");
        } else if (mixinClassName.endsWith("MobEntityMixinNew")) {
            // 在 1.20.6 使用新版 Mixin
            return mcVersion.compareTo("1.20.6") >= 0;
        }
        return true;
    }


    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {}

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {

    }

    @Override
    public void postApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {

    }
}
