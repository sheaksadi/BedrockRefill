package me.sheak.sadi.Bedrock;

import me.sheak.sadi.Bedrock.Events.ChunkLoad;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChunkLoad(),this);
    }
    @Override
    public void onDisable() {

    }
}
