package dev.terra.terramobfighting.Tasks;

import dev.terra.terramobfighting.events.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

public class One extends BukkitRunnable {

    PlayerJoin plugin;

    public One(PlayerJoin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {

        Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Mob Fighting Round one Starting in 1 seconds");

    }

}

