package dev.terra.terramobfighting.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GUICommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;

            Inventory gui = Bukkit.createInventory(player, 9, ChatColor.AQUA + "Custom GUI");

            ItemStack kill = new ItemStack(Material.TNT);
            ItemStack saturate = new ItemStack(Material.COOKED_BEEF);
            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);

            ItemStack[] menuItems = {kill, saturate, sword};
            gui.setContents(menuItems);

            player.openInventory(gui);

        }

        return true;
    }

}
