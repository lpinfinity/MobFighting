package dev.terra.terramobfighting;

import dev.terra.terramobfighting.commands.GUICommand;
import dev.terra.terramobfighting.events.PlayerJoin;
import dev.terra.terramobfighting.events.SpawnMobs;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new PlayerJoin(),this);
        getServer().getPluginManager().registerEvents(new SpawnMobs(),this);

        getCommand("gui").setExecutor(new GUICommand());

        System.out.println(ChatColor.GREEN +  "MobFighting has started");

    }

}
