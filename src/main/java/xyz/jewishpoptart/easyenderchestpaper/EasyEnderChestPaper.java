package xyz.jewishpoptart.easyenderchestpaper;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class EasyEnderChestPaper extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // register events
        Bukkit.getPluginManager().registerEvents(new EDCListeners(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
