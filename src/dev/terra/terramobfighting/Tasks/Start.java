package dev.terra.terramobfighting.Tasks;

import dev.terra.terramobfighting.Main;
import dev.terra.terramobfighting.events.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.Location;
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
    }

}
