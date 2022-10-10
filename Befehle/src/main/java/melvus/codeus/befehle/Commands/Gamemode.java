package melvus.codeus.befehle.Commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "Du musst ein Spieler sein!");
        }
        Player player = (Player) sender;

        if(args.length == 1){
            if(args[0].equalsIgnoreCase("1")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.GREEN + "Dein Spielmodus ist Kreativ!");
            } else if (args[0].equalsIgnoreCase("0")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.GREEN + "Dein Spielmodus ist Überleben!");
            } else if (args[0].equalsIgnoreCase("2")){
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage(ChatColor.GREEN + "Dein Spielmodus ist Hardcore!");
            }else if (args[0].equalsIgnoreCase("3")){
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage(ChatColor.GREEN + "Dein Spielmodus ist Zuschauer!");
            }else{
                player.sendMessage(ChatColor.RED + "Invalid Number 0-3");
            }
        }

        return false;
    }
}
