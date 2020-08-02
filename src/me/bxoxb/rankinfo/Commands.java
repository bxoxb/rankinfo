package me.bxoxb.rankinfo;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.md_5.bungee.api.ChatColor;

public class Commands implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("savage")) {
			sender.sendMessage(ChatColor.DARK_GREEN + "Savage" + ChatColor.GRAY + " Rank perks!");
			sender.sendMessage(" ");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to 2 homes!");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "1.2 more job xp.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "1.25 more job money.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to kit food.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to kit build.");
		}
		if (cmd.getName().equalsIgnoreCase("brawler")) {
			sender.sendMessage(ChatColor.DARK_GREEN + "Brawler" + ChatColor.GRAY + " Rank perks!");
			sender.sendMessage(" ");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to everything from /savage.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to 3 homes!");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "1.4 more job xp.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "1.75 more job money.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to /hat.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to /sellhand.");
		}
		if (cmd.getName().equalsIgnoreCase("mercenary")) {
			sender.sendMessage(ChatColor.DARK_GREEN + "Mercenary" + ChatColor.GRAY + " Rank perks!");
			sender.sendMessage(" ");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to everything from /brawler.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to 4 homes!");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "1.6 more job xp.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "2.5 more job money.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to mine spawners.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to /sellall.");
		}
		if (cmd.getName().equalsIgnoreCase("fighter")) {
			sender.sendMessage(ChatColor.DARK_GREEN + "fighter" + ChatColor.GRAY + " Rank perks!");
			sender.sendMessage(" ");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to everything from /mercenary.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to 5 homes!");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "1.8 more job xp.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "3.75 more job money.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to /fixhand.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to kit architect.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to kit banquet.");
		}
		if (cmd.getName().equalsIgnoreCase("gladiator")) {
			sender.sendMessage(ChatColor.DARK_GREEN + "Gladiator" + ChatColor.GRAY + " Rank perks!");
			sender.sendMessage(" ");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to everything from /figter.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to 6 homes!");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "2.0 more job xp.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "5.0 more job money.");
			sender.sendMessage(ChatColor.YELLOW + "* " + ChatColor.WHITE + "Access to /tfly.");
		}

		return true;
	}

}
