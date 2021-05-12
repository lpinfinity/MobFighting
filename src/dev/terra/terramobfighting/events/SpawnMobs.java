package dev.terra.terramobfighting.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

public class SpawnMobs implements Listener {

    @EventHandler
    public static void onPlayerTeleport(PlayerTeleportEvent event) {

        Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Spawning Zombies!");
        Location location = new Location(Bukkit.getWorld("world"), 0, 100, 0);
        location.getWorld().spawnEntity(location,EntityType.ZOMBIE);

    }

}
