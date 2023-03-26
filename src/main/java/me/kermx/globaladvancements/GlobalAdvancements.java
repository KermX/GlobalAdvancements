package me.kermx.globaladvancements;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class GlobalAdvancements extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new advancementHandler(this);
        Bukkit.getLogger().info("GlobalAdvancements enabled successfully!");


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("GlobalAdvancements disabled successfully!");
    }
}
