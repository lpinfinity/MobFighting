package dev.terra.terramobfighting.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class MobDeath implements Listener {

    long amount;

    @EventHandler
    public void onMobDeath(EntityDeathEvent event) {

        amount = Bukkit.getServer().getWorld("world").getLivingEntities().stream().map(LivingEntity::getCustomName).filter("zombie"::equalsIgnoreCase).count();

        if(amount == 0) {
            Bukkit.broadcastMessage("the last zombie has died");
        }else{
            Bukkit.broadcastMessage("" + amount);
        }

    }

}
