package dev.terra.terramobfighting.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class FallDamage implements Listener {

    @EventHandler
    public static void onPlayerDamage(final EntityDamageEvent event) {

        if (event.getCause() == EntityDamageEvent.DamageCause.FALL) {

            event.setCancelled(true);

        }

    }

}
