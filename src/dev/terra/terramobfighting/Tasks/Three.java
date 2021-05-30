package dev.terra.terramobfighting.Tasks;

import dev.terra.terramobfighting.events.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

public class Three extends BukkitRunnable {

    PlayerJoin plugin;

    public Three(PlayerJoin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {

        Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Mob Fighting Round one Starting in 3 seconds");

    }

}


