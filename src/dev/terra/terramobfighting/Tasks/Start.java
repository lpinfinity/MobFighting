package dev.terra.terramobfighting.Tasks;

import dev.terra.terramobfighting.Main;
import dev.terra.terramobfighting.events.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Random;

public class Start extends BukkitRunnable {

    PlayerJoin plugin;
    Main main;

    public Start(PlayerJoin plugin) {
        this.plugin = plugin;
    }

    public Location[] locations = new Location[8];

    private int loop = 0;

    @Override
    public void run() {

        Location location = new Location(Bukkit.getWorld("world"), 0, 100, 0);
        for (Player player : Bukkit.getServer().getOnlinePlayers()) {

            player.teleport(location);

        }


        Location location0 = new Location(Bukkit.getWorld("world"), -5, 100, 3);
        Location location1 = new Location(Bukkit.getWorld("world"), 5, 100, 4);
        Location location2 = new Location(Bukkit.getWorld("world"), -9, 100, -8);
        Location location3 = new Location(Bukkit.getWorld("world"), 3, 100, -5);
        Location location4 = new Location(Bukkit.getWorld("world"), 3, 100, -5);
        Location location5 = new Location(Bukkit.getWorld("world"), 4, 100, 5);
        Location location6 = new Location(Bukkit.getWorld("world"), 8, 100, 9);
        Location location7 = new Location(Bukkit.getWorld("world"), -9, 100, 8);


        locations[0] = location0;
        locations[1] = location1;
        locations[2] = location2;
        locations[3] = location3;
        locations[4] = location4;
        locations[5] = location5;
        locations[6] = location6;
        locations[7] = location7;



        Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Spawning Zombies!");

        SpawnZombies(8);


        long amount = Bukkit.getServer().getWorld("world").getLivingEntities().stream().map(LivingEntity::getCustomName).count();

        if (String.valueOf(amount) == "0") {

            //BukkitTask RoundTwo = new RoundTwo(this).runTaskLater(, 20L);

            Bukkit.getScheduler().scheduleSyncDelayedTask(main, new Runnable() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage("HEllO");
                }
            }, 20L);

        }

    }

    private void SpawnZombies(int amount) {
        if(loop < amount){
            Random rand = new Random();
            int upper = locations.length;
            int spawnLocation = rand.nextInt(upper);
            locations[spawnLocation].getWorld().spawnEntity(locations[spawnLocation], EntityType.ZOMBIE).setCustomName("zombie");
            loop = loop + 1;
            SpawnZombies(amount);
        }else{
            loop = 0;
        }
    }

}
