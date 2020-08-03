package me.bxoxb.rankinfo;

import me.bxoxb.rankinfo.commands.CommandRankInfo;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class RankInfo extends JavaPlugin {

    private static RankInfo instance;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        getLogger().info("Rankinfo Enabled!");
        getLogger().info("Copyright 2020 bxoxb.");
        registerCommands();
    }

    @Override
    public void onDisable() {
        getLogger().info("Rankinfo Disaled!");
        getLogger().info("Copyright 2020 bxoxb.");
    }

    private void registerCommands() {
        registerCommand("rank", new CommandRankInfo());
    }

    private void registerCommand(String commandName, CommandExecutor executor) {
        PluginCommand command = getCommand(commandName);
        if (command == null)
            return;
        command.setExecutor(executor);
    }

    public static RankInfo getInstance() {
        return instance;
    }
}
