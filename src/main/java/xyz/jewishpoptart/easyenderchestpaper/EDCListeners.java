package xyz.jewishpoptart.easyenderchestpaper;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class EDCListeners implements Listener {

    CustomEnderChest EDC = new CustomEnderChest();
    // create event listeners for whats on trello

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent p) {
        ItemStack playersInventory = p.getPlayer().getInventory().getItem(9);

        //Check if player has custom ender chest item in their inventory. if not, add.
        if (playersInventory == EDC.getCustomEnderChest()) {
            System.out.println(p.getPlayer().getName() + " has an enderchest already.");
        } else {
            p.getPlayer().getInventory().setItem(9, EDC.getCustomEnderChest());
            p.getPlayer().sendMessage("Your ender chest has been added to your inventory.");
            System.out.println("Enderchest added for " + p.getPlayer().getName());
        }
    }

    @EventHandler
    public void onCustomEnderchestClick(InventoryClickEvent c) {
        if(c.getRawSlot() == 9 && c.getCurrentItem().displayName() == EDC.getCustomEnderChest().displayName()) {
            c.setCancelled(true);
            c.getWhoClicked().closeInventory();
            c.getWhoClicked().openInventory(c.getWhoClicked().getEnderChest());
        }
    }
}
