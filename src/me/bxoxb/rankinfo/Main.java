package me.bxoxb.rankinfo;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	public static PluginManager pm = Bukkit.getPluginManager();

	public void onEnable() {
		getLogger().info("Rankinfo Enabled!");
		getLogger().info("Copyright 2020 bxoxb.");
		pm.registerEvents(this, (Plugin) this);
		this.getCommand("savage").setExecutor(new Commands());
		this.getCommand("brawler").setExecutor(new Commands());
		this.getCommand("mercenary").setExecutor(new Commands());
		this.getCommand("fighter").setExecutor(new Commands());
		this.getCommand("gladiator").setExecutor(new Commands());
	}

	public void onDisble() {
		getLogger().info("Rankinfo Disaled!");
		getLogger().info("Copyright 2020 bxoxb.");
	}

}
