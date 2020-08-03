package me.bxoxb.rankinfo.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandRankInfo implements TabCompleter, CommandExecutor {

    private static final String[] RANK_INFO = {"savage", "brawler", "mercenary", "fighter", "gladiator"};

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof ConsoleCommandSender) {
            sender.sendMessage(ChatColor.RED + "This command can only be used in game.");
            return true;
        }

        Player p = (Player) sender;

        if (args.length <= 0) {
            p.sendMessage(ChatColor.RED + "Correct usage of /rank\n" + ChatColor.RED +"/rank {savage, brawler, mercenary, fighter, gladiator}");
            return true;
        }

        RankInfo rankInfo = RankInfo.getInfoByName(args[0]);

        if (rankInfo == null) {
            p.sendMessage(ChatColor.RED + "The rank " + args[0].trim() + " is not a valid rank");
            return true;
        }

        ArrayList<String> info = rankInfo.getFormattedDescription();

        for (String infoLine : info)
            p.sendMessage(infoLine);
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return Arrays.asList(RANK_INFO);
    }

    public enum RankInfo {

        SAVAGE("savage") {
            @Override
            public ArrayList<String> getFormattedDescription() {
                ArrayList<String> lines = new ArrayList<>();

                lines.add(ChatColor.DARK_GREEN + "Savage" + ChatColor.GRAY + " Rank perks!");
                lines.add(" ");
                lines.add(prefix + "Access to 2 homes!");
                lines.add(prefix + "1.2 more job xp.");
                lines.add(prefix + "1.25 more job money.");
                lines.add(prefix + "Access to kit food.");
                lines.add(prefix + "Access to kit build.");

                return lines;
            }
        },

        BRAWLER("brawler") {
            @Override
            public ArrayList<String> getFormattedDescription() {
                ArrayList<String> lines = new ArrayList<>();

                lines.add(ChatColor.DARK_GREEN + "Brawler" + ChatColor.GRAY + " Rank perks!");
                lines.add(" ");
                lines.add(prefix + "Access to everything from /ranks savage!");
                lines.add(prefix + "Access to 3 homes!");
                lines.add(prefix + "1.4 more job xp.");
                lines.add(prefix + "1.75 more job money.");
                lines.add(prefix + "Access to /hat.");
                lines.add(prefix + "Access to /sellhand.");

                return lines;
            }
        },

        MERCENARY("mercenary") {
            @Override
            public ArrayList<String> getFormattedDescription() {
                ArrayList<String> lines = new ArrayList<>();

                lines.add(ChatColor.DARK_GREEN + "Mercenary" + ChatColor.GRAY + " Rank perks!");
                lines.add(" ");
                lines.add(prefix + "Access to everything from /ranks brawler!");
                lines.add(prefix + "Access to 4 homes!");
                lines.add(prefix + "1.6 more job xp.");
                lines.add(prefix + "2.5 more job money.");
                lines.add(prefix + "Access to mine spawners.");
                lines.add(prefix + "Access to /sellall.");

                return lines;
            }
        },

        FIGHTER("fighter") {
            @Override
            public ArrayList<String> getFormattedDescription() {
                ArrayList<String> lines = new ArrayList<>();

                lines.add(ChatColor.DARK_GREEN + "Fighter" + ChatColor.GRAY + " Rank perks!");
                lines.add(" ");
                lines.add(prefix + "Access to everything from /ranks mercenary!");
                lines.add(prefix + "Access to 5 homes!");
                lines.add(prefix + "1.8 more job xp.");
                lines.add(prefix + "3.75 more job money.");
                lines.add(prefix + "Access to /fixhand.");
                lines.add(prefix + "Access to kit architect.");
                lines.add(prefix + "Access to kit banquet.");

                return lines;
            }
        },

        GLADIATOR("gladiator") {
            @Override
            public ArrayList<String> getFormattedDescription() {
                ArrayList<String> lines = new ArrayList<>();

                lines.add(ChatColor.DARK_GREEN + "Galdiator" + ChatColor.GRAY + " Rank perks!");
                lines.add(" ");
                lines.add(prefix + "Access to everything from /ranks fighter!");
                lines.add(prefix + "Access to 6 homes!");
                lines.add(prefix + "2.0 more job xp.");
                lines.add(prefix + "5.0 more job money.");
                lines.add(prefix + "Access to /tfly.");

                return lines;
            }
        };

        private final String name;

        RankInfo(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        private static RankInfo getInfoByName(String toCompare) {
            for (RankInfo rank : RankInfo.values()) {
                if (rank.getName().equalsIgnoreCase(toCompare))
                    return rank;
            }
            return null;
        }

        private static final String prefix = ChatColor.YELLOW + "* " + ChatColor.WHITE;

        public abstract ArrayList<String> getFormattedDescription();
    }
}
