package dev.terra.terramobfighting.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlaced implements Listener {

    private final PlayerClick playerClick;
    public BlockPlaced(PlayerClick playerClick) {
        this.playerClick = playerClick;
    }

    @EventHandler
    public void blockPlacedEvent(BlockPlaceEvent event) {

        if(event.getItemInHand().getItemMeta().getLore() == playerClick.trophy) {
            event.getPlayer().sendMessage("block placed");
        }

    }

}
