package dev.terra.terramobfighting.Tasks;

import dev.terra.terramobfighting.Main;
import org.bukkit.scheduler.BukkitRunnable;

public class Start extends BukkitRunnable {

    Main plugin;

    public Start(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {

        System.out.println("Task has Been Run!!");

    }
}
