package dev.terra.terramobfighting.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class EntityCount extends JavaPlugin {

    public static EntityCount plugin;
    public List<Entity> entityies;

}

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (cmd.getName().equalsIgnoreCase("es")) {
            if (args.length == 0) {
                return false;
            } else if (args[0].equalsIgnoreCase("count")) {

                for (World world : Bukkit.getServer().getWorlds()) {
                    entities = world.getEntities();

                }

            }

            this.log.info("Counting...");
            this.log.info("Count = " + entities.size());
            return true;
        }


        return false;

    }
}