package dev.terra.terramobfighting.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerClick implements Listener {

    @EventHandler
    public void ClickEvent(InventoryClickEvent event) {

        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "Custom GUI")) {

            Player player = (Player) event.getWhoClicked();

            switch(event.getCurrentItem().getType()) {
                case TNT:
                    player.closeInventory();
                    player.setHealth(0.0);
                    break;
                case COOKED_BEEF:
                    player.closeInventory();
                    player.setSaturation(20);
                    player.setFoodLevel(20);
                    break;
                case DIAMOND_SWORD:
                    player.closeInventory();
                    player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
                    break;
            }

            event.setCancelled(true);
        }

    }

}
