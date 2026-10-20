package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Altar SMP Plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Altar SMP Plugin has been disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("altar") && sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("Welcome to the Altar SMP!");
            return true;
        }
        return false;
    }
}