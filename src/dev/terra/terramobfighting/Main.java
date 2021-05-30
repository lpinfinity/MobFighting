package dev.terra.terramobfighting;

import dev.terra.terramobfighting.Tasks.Start;
import dev.terra.terramobfighting.commands.GUICommand;
import dev.terra.terramobfighting.events.PlayerClick;
import dev.terra.terramobfighting.events.PlayerJoin;
import dev.terra.terramobfighting.events.SpawnMobs;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new PlayerJoin(this),this);
        getServer().getPluginManager().registerEvents(new SpawnMobs(),this);
        getServer().getPluginManager().registerEvents(new PlayerClick(), this);

        getCommand("gui").setExecutor(new GUICommand());

        System.out.println(ChatColor.GREEN +  "MobFighting has started");

        //BukkitTask Start = new Start(this).runTaskLater(this,100L);

    }

}
