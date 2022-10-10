package melvus.codeus.befehle.NewItems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import sun.net.www.content.text.Generic;

public class MasterSword implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            ItemStack MasterSword = new ItemStack(Material.NETHERITE_SWORD);
            ItemMeta masterMeta = MasterSword.getItemMeta();
            masterMeta.setUnbreakable(true);
            masterMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("Generic.attackDamage", 1000, AttributeModifier.Operation.ADD_NUMBER));
            MasterSword.setItemMeta(masterMeta);
            player.getInventory().addItem(MasterSword);
            }else{
            sender.sendMessage(ChatColor.RED + "Invalid Entity!");

        }
        return false;
    }
}
