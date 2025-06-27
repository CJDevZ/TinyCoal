package de.cjdev.tinycoal;

import de.cjdev.papermodapi.api.itemgroup.CustomItemGroup;
import de.cjdev.papermodapi.api.itemgroup.CustomItemGroups;
import de.cjdev.tinycoal.item.ModItems;
import net.kyori.adventure.text.Component;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

public final class TinyCoal extends JavaPlugin {

    @Override
    public void onEnable() {
        ModItems.a();
        CustomItemGroups.register(b("itemgroup"), CustomItemGroup.builder()
                .displayName(Component.translatable("item.tinycoal.tinycoal"))
                .icon(ModItems.TINY_COAL::getDefaultStack)
                .entries((b, entries) -> {
                    entries.add(ModItems.TINY_COAL);
                    entries.add(ModItems.TINY_CHARCOAL);
                }).build());
    }

    public static NamespacedKey b(String id){
        return new NamespacedKey("tinycoal", id);
    }

}
