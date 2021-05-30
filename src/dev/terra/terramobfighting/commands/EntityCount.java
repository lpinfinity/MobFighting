package dev.terra.terramobfighting.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class EntityCount implements CommandExecutor {

    public static final String NAME_TO_SEARCH = "zombie";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player player = (Player) sender;

        long amount = Bukkit.getServer().getWorld("world").getLivingEntities().stream().map(LivingEntity::getCustomName).filter(NAME_TO_SEARCH::equalsIgnoreCase).count();

        player.sendMessage(String.valueOf(amount));

        return true;
    }
}
