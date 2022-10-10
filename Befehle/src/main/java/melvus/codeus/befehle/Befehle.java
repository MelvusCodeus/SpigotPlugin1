package melvus.codeus.befehle;

import melvus.codeus.befehle.Commands.Gamemode;
import melvus.codeus.befehle.NewItems.BanHammer;
import melvus.codeus.befehle.NewItems.MasterSword;
import melvus.codeus.befehle.listener.AListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Befehle extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("gm").setExecutor(new Gamemode());
        getCommand("mastersword").setExecutor(new MasterSword());
        getCommand("Banhammer").setExecutor(new BanHammer());
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new AListener(),this);
        pm.registerEvents(new BanHammer(), this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
