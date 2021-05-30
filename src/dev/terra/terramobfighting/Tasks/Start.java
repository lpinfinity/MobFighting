package dev.terra.terramobfighting.Tasks;

import dev.terra.terramobfighting.events.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Random;

public class Start extends BukkitRunnable {

    PlayerJoin plugin;

    public Start(PlayerJoin plugin) {
        this.plugin = plugin;
    }

    public Location[] locations = new Location[4];

    private int loop = 0;

    @Override
    public void run() {

        Location location = new Location(Bukkit.getWorld("world"), 0, 100, 0);
        for (Player player : Bukkit.getServer().getOnlinePlayers()) {

            player.teleport(location);

        }

        Location location1 = new Location(Bukkit.getWorld("world"), -5, 100, 3);
        Location location2 = new Location(Bukkit.getWorld("world"), 5, 100, 4);
        Location location3 = new Location(Bukkit.getWorld("world"), -9, 100, -8);
        Location location4 = new Location(Bukkit.getWorld("world"), 3, 100, -5);

        locations[1] = location1;
        locations[2] = location2;
        locations[3] = location3;
        locations[4] = location4;



        Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Spawning Zombies!");

        SpawnZombies(4);

    }

    private void SpawnZombies(int amount) {
        if(loop < amount){
            Random rand = new Random();
            int upper = locations.length;
            int spawnLocation = rand.nextInt(upper);
            locations[spawnLocation].getWorld().spawnEntity(locations[spawnLocation], EntityType.ZOMBIE);
            loop = loop + 1;
            SpawnZombies(amount);
        }else{
            loop = 0;
        }
    }

}
