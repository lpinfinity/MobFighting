package dev.terra.terramobfighting.events;

import dev.terra.terramobfighting.Main;
import dev.terra.terramobfighting.Tasks.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitTask;

public class PlayerJoin implements Listener {

    Main main;
    public PlayerJoin(Main main) {
        this.main = main;
    }
    Start start;

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        start = new Start(main);

        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp " + '"' + event.getPlayer().getName() + '"' + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getX() + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getY() + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getZ());

        if(Bukkit.getServer().getOnlinePlayers().size() == 2) {

            Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Mob Fighting Round one Starting in 5 seconds");


            Bukkit.getScheduler().scheduleSyncDelayedTask(main, new Runnable() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage(ChatColor.GREEN +  "Mob Fighting Round one Starting in 4 seconds");
                }
            }, 20L);

            Bukkit.getScheduler().scheduleSyncDelayedTask(main, new Runnable() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Mob Fighting Round one Starting in 3 seconds");
                }
            }, 40L);

            Bukkit.getScheduler().scheduleSyncDelayedTask(main, new Runnable() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Mob Fighting Round one Starting in 2 seconds");
                }
            }, 60L);

            Bukkit.getScheduler().scheduleSyncDelayedTask(main, new Runnable() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Mob Fighting Round one Starting in 1 seconds");
                }
            }, 80L);

            Bukkit.getScheduler().scheduleSyncDelayedTask(main, new Runnable() {
                @Override
                public void run() {
                    start.run();
                }
            }, 100L);

            //BukkitTask Start = new Start().runTaskLater(this,100L);

        }

    }

}




