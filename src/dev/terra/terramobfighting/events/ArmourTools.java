package dev.terra.terramobfighting.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.Listener;

public class ArmourTools implements Listener{

    @EventHandler
    public static void onPlayerWalk(PlayerMoveEvent event) {

        Player player = event.getPlayer();
        int z = player.getLocation().getBlockZ();

        if (z <= 18) {

            player.getInventory().setItem(0, new ItemStack(Material.WOODEN_SWORD,1));
            player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
            player.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
            player.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
            player.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));

        }

    }


}
