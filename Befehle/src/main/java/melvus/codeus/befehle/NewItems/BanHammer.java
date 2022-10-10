package melvus.codeus.befehle.NewItems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class BanHammer implements CommandExecutor, Listener {
    private ItemStack BanHammer = new ItemStack(Material.DIAMOND_BLOCK);

    @EventHandler(ignoreCancelled = true)
    public void onEntityDeath(EntityDeathEvent event) {
        LivingEntity killed = event.getEntity();
        Player killer = killed.getKiller();
        killer.getInventory().getItemInMainHand();
        killer.getInventory().getItemInOffHand();
        if (killer.getInventory().getItemInOffHand() == BanHammer || killer.getInventory().getItemInMainHand() == BanHammer){
            killer.performCommand("ban "+killed.getUniqueId().toString());

        }

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;

            ItemMeta masterMeta = BanHammer.getItemMeta();
            masterMeta.setUnbreakable(true);
            masterMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("Generic.attackDamage", 1000, AttributeModifier.Operation.ADD_NUMBER));
            BanHammer.setItemMeta(masterMeta);
            player.getInventory().addItem(BanHammer);

        }else{
            sender.sendMessage(ChatColor.RED + "Invalid Entity! Need to be a Player");
        }

        return false;
    }



}
