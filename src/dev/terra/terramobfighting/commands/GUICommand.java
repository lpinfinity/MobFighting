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
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUICommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;

            Inventory gui = Bukkit.createInventory(player, 9, ChatColor.AQUA + "Custom GUI");

            ItemStack kill = new ItemStack(Material.TNT);
            ItemStack saturate = new ItemStack(Material.COOKED_BEEF);
            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
            ItemStack trophy = new ItemStack(Material.YELLOW_STAINED_GLASS);

            ItemMeta killMeta = kill.getItemMeta();
            killMeta.setDisplayName(ChatColor.RED + "Kill Yourself");
            ArrayList<String> killLore = new ArrayList<>();
            killLore.add(ChatColor.WHITE + "This cannot be undone");
            killMeta.setLore(killLore);
            kill.setItemMeta(killMeta);

            ItemMeta saturateMeta = saturate.getItemMeta();
            saturateMeta.setDisplayName(ChatColor.GOLD + "Refill Hunger");
            ArrayList<String> saturateLore = new ArrayList<>();
            saturateLore.add(ChatColor.WHITE + "The final solution to world hunger");
            saturateMeta.setLore(saturateLore);
            saturate.setItemMeta(saturateMeta);

            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setDisplayName(ChatColor.DARK_PURPLE + "Gain a sword");
            ArrayList<String> swordLore = new ArrayList<>();
            swordLore.add(ChatColor.WHITE + "Who doesn't like free stuff?");
            swordMeta.setLore(swordLore);
            sword.setItemMeta(swordMeta);

            ItemMeta trophyMeta = trophy.getItemMeta();
            trophyMeta.setDisplayName(ChatColor.YELLOW + "Test Trophy");
            ArrayList<String> trophyLore = new ArrayList<>();
            trophyLore.add(ChatColor.WHITE + "Test Trophy");
            trophyMeta.setLore(trophyLore);
            trophy.setItemMeta(trophyMeta);

            ItemStack[] menuItems = {kill, saturate, sword};
            gui.setContents(menuItems);

            player.openInventory(gui);

        }

        return true;
    }

}
