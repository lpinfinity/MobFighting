package dev.terra.terramobfighting.events;

import dev.terra.terramobfighting.Main;
import dev.terra.terramobfighting.Tasks.Start;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitTask;



public class PlayerJoin implements Listener {

        private final Main main;
        public PlayerJoin(Main main) {
            this.main = main;
        }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp " + '"' + event.getPlayer().getName() + '"' + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getX() + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getY() + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getZ());

        if(Bukkit.getServer().getOnlinePlayers().size() == 2) {

            Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Mob Fighting Round one Starting!");

            BukkitTask Start = new Start(this).runTaskLater(main,100L);

            }







        }

    }




