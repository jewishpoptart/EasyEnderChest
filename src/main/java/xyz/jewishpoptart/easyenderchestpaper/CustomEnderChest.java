package xyz.jewishpoptart.easyenderchestpaper;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomEnderChest {
    public ItemStack getCustomEnderChest() {
        ItemStack EDC = new ItemStack(Material.ENDER_CHEST);
        ItemMeta EDCMeta = EDC.getItemMeta();
        // Not how to handle this.. but for testing we use display name :)
        assert EDCMeta != null;
        EDCMeta.setDisplayName("§bClick to open your enderchest");
        EDC.setItemMeta(EDCMeta);
        return EDC;
    }
}
