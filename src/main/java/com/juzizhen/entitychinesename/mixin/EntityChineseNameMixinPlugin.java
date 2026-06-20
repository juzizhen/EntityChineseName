package com.juzizhen.entitychinesename.mixin;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.VersionParsingException;
import net.fabricmc.loader.api.metadata.version.VersionPredicate;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class EntityChineseNameMixinPlugin implements IMixinConfigPlugin {

    private String mcVersion;
    private boolean is1_20_5OrNewer = false;

    @Override
    public void onLoad(String mixinPackage) {
        try {
            Optional<ModContainer> mcContainer = FabricLoader.getInstance().getModContainer("minecraft");

            if (mcContainer.isPresent()) {
                Version mcVersion = mcContainer.get().getMetadata().getVersion();
                VersionPredicate predicate = VersionPredicate.parse(">=1.20.5");
                is1_20_5OrNewer = predicate.test(mcVersion);
            } else {
                is1_20_5OrNewer = true;
            }
        } catch (VersionParsingException e) {
            throw new RuntimeException("Failed to parse Minecraft version predicate", e);
        }
    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        // 根据版本号选择性加载 Mixin
        if (mixinClassName.endsWith("MobEntityMixinOld")) {
            // 在 1.20.1 到 1.20.4 使用旧版 Mixin（initialize 方法包含 NbtCompound 参数）
            return !is1_20_5OrNewer;
        } else if (mixinClassName.endsWith("MobEntityMixinNew")) {
            // 在 1.20.5+ 使用新版 Mixin（initialize 方法移除了 NbtCompound 参数）
            return is1_20_5OrNewer;
        }
        return true;
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {
    }

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
