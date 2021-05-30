package dev.terra.terramobfighting.Tasks;

import dev.terra.terramobfighting.Main;
import dev.terra.terramobfighting.events.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Start extends BukkitRunnable {

    PlayerJoin plugin;

    public Start(PlayerJoin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {

        Location location = new Location(Bukkit.getWorld("world"), 0, 100, 0);
        for (Player player : Bukkit.getServer().getOnlinePlayers()) {

            player.teleport(location);

        }

        Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Spawning Zombies!");
        Location location1 = new Location(Bukkit.getWorld("world"), -5, 100, 3);
        location1.getWorld().spawnEntity(location1, EntityType.ZOMBIE);

        Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Spawning Zombies!");
        Location location2 = new Location(Bukkit.getWorld("world"), 5, 100, 4);
        location2.getWorld().spawnEntity(location2, EntityType.ZOMBIE);

        Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Spawning Zombies!");
        Location location3 = new Location(Bukkit.getWorld("world"), -9, 100, -8);
        location3.getWorld().spawnEntity(location3, EntityType.ZOMBIE);

        Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Spawning Zombies!");
        Location location4 = new Location(Bukkit.getWorld("world"), 3, 100, -5);
        location4.getWorld().spawnEntity(location4, EntityType.ZOMBIE);

    }

}
