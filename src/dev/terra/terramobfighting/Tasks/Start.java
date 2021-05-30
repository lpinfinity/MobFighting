package dev.terra.terramobfighting.Tasks;

import dev.terra.terramobfighting.Main;
import dev.terra.terramobfighting.events.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import java.util.Random;

public class Start extends PlayerJoin {

    Boolean test = true;

    public Location[] locations = new Location[23];

    private int loop = 0;

    Main main;

    public Start(Main main) {
        super(main);
        this.main = main;
    }

    public void run() {

        Location location = new Location(Bukkit.getWorld("world"), 28, 12, 152);
        for (Player player : Bukkit.getServer().getOnlinePlayers()) {

            player.teleport(location);

        }


        Location location0 = new Location(Bukkit.getWorld("world"), 1, 12, 127);
        Location location1 = new Location(Bukkit.getWorld("world"), 13, 12, 123);
        Location location2 = new Location(Bukkit.getWorld("world"), 33, 12, 131);
        Location location3 = new Location(Bukkit.getWorld("world"), 38, 12, 138);
        Location location4 = new Location(Bukkit.getWorld("world"), 43, 13, 131);
        Location location5 = new Location(Bukkit.getWorld("world"), 50, 14, 132);
        Location location6 = new Location(Bukkit.getWorld("world"), 52, 14, 122);
        Location location7 = new Location(Bukkit.getWorld("world"), 49, 14, 121);
        Location location8 = new Location(Bukkit.getWorld("world"), 59, 17, 124);
        Location location9 = new Location(Bukkit.getWorld("world"), 55, 14, 143);
        Location location10 = new Location(Bukkit.getWorld("world"), 46, 13, 147);
        Location location11 = new Location(Bukkit.getWorld("world"), 49, 12, 158);
        Location location12 = new Location(Bukkit.getWorld("world"), 55, 12, 158);
        Location location13 = new Location(Bukkit.getWorld("world"), 39, 12, 165);
        Location location14 = new Location(Bukkit.getWorld("world"), 23, 12, 172);
        Location location15 = new Location(Bukkit.getWorld("world"), 5, 13, 160);
        Location location16 = new Location(Bukkit.getWorld("world"), 6, 13, 160);
        Location location17 = new Location(Bukkit.getWorld("world"), 5, 13, 164);
        Location location18 = new Location(Bukkit.getWorld("world"), 0, 12, 151);
        Location location19 = new Location(Bukkit.getWorld("world"), -4, 12, 141);
        Location location20 = new Location(Bukkit.getWorld("world"), -8, 12, 136);
        Location location21 = new Location(Bukkit.getWorld("world"), -6, 12, 129);
        Location location22 = new Location(Bukkit.getWorld("world"), 18, 12, 144);


        locations[0] = location0;
        locations[1] = location1;
        locations[2] = location2;
        locations[3] = location3;
        locations[4] = location4;
        locations[5] = location5;
        locations[6] = location6;
        locations[7] = location7;
        locations[8] = location8;
        locations[9] = location9;
        locations[10] = location10;
        locations[11] = location11;
        locations[12] = location12;
        locations[13] = location13;
        locations[14] = location14;
        locations[15] = location15;
        locations[16] = location16;
        locations[17] = location17;
        locations[18] = location18;
        locations[19] = location19;
        locations[20] = location20;
        locations[21] = location21;
        locations[22] = location22;


        Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Spawning Zombies!");

        SpawnZombies(23);


        long amount = Bukkit.getServer().getWorld("world").getLivingEntities().stream().map(LivingEntity::getCustomName).count();

        Bukkit.getScheduler().scheduleSyncRepeatingTask(main, new Runnable() {
            @Override
            public void run() {
                if(String.valueOf(amount) == "0") {
                    Bukkit.getScheduler().scheduleSyncDelayedTask(main, new Runnable() {
                        @Override
                        public void run() {
                            Bukkit.broadcastMessage("HEllO");
                        }
                    }, 20L);
                    test = false;
                }
            }
        }, 20L, 999999999999L);

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
