package dev.terra.terramobfighting.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class BlockPlaced implements Listener {

    private final PlayerClick playerClick;
    public BlockPlaced(PlayerClick playerClick) {
        this.playerClick = playerClick;
    }

    @EventHandler
    public void blockPlacedEvent(PlayerInteractEvent event) {

        if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if(event.getItem().getItemMeta() == playerClick.trophy) {
                event.getPlayer().sendMessage("block placed");
            }
        }

    }

}
