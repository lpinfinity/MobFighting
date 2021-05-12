package dev.terra.terramobfighting.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {

        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp " + '"' + event.getPlayer().getName() + '"' + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getX() + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getY() + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getZ());

        if(Bukkit.getServer().getOnlinePlayers().size() == 2) {

            Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Mob Fighting Round one Starting!");

            Location location = new Location(Bukkit.getWorld("world"), 0, 100, 0);
            for(Player player:Bukkit.getServer().getOnlinePlayers()) {

                player.teleport(location);

            }







        }

    }

}


