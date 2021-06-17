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

        locations[0] = new Location(Bukkit.getWorld("world"), 1, 12, 127);
        locations[1] = new Location(Bukkit.getWorld("world"), 13, 12, 123);
        locations[2] = new Location(Bukkit.getWorld("world"), 33, 12, 131);
        locations[3] = new Location(Bukkit.getWorld("world"), 38, 12, 138);
        locations[4] = new Location(Bukkit.getWorld("world"), 43, 13, 131);
        locations[5] = new Location(Bukkit.getWorld("world"), 50, 14, 132);
        locations[6] = new Location(Bukkit.getWorld("world"), 52, 14, 122);
        locations[7] = new Location(Bukkit.getWorld("world"), 49, 14, 121);
        locations[8] = new Location(Bukkit.getWorld("world"), 59, 17, 124);
        locations[9] = new Location(Bukkit.getWorld("world"), 55, 14, 143);
        locations[10] = new Location(Bukkit.getWorld("world"), 46, 13, 147);
        locations[11] = new Location(Bukkit.getWorld("world"), 49, 12, 158);
        locations[12] = new Location(Bukkit.getWorld("world"), 55, 12, 158);
        locations[13] = new Location(Bukkit.getWorld("world"), 39, 12, 165);
        locations[14] = new Location(Bukkit.getWorld("world"), 23, 12, 172);
        locations[15] = new Location(Bukkit.getWorld("world"), 5, 13, 160);
        locations[16] = new Location(Bukkit.getWorld("world"), 6, 13, 160);
        locations[17] = new Location(Bukkit.getWorld("world"), 5, 13, 164);
        locations[18] = new Location(Bukkit.getWorld("world"), 0, 12, 151);
        locations[19] = new Location(Bukkit.getWorld("world"), -4, 12, 141);
        locations[20] = new Location(Bukkit.getWorld("world"), -8, 12, 136);
        locations[21] = new Location(Bukkit.getWorld("world"), -6, 12, 129);
        locations[22] = new Location(Bukkit.getWorld("world"), 18, 12, 144);

        Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Spawning Zombies!");

        SpawnZombies(23);

        long amount = Bukkit.getServer().getWorld("world").getLivingEntities().stream().map(LivingEntity::getCustomName).count();

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
