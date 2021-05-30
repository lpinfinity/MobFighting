package dev.terra.terramobfighting.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PlayerClick implements Listener {

    @EventHandler
    public void ClickEvent(InventoryClickEvent event) {
        event.setCancelled(true);
    }

}
