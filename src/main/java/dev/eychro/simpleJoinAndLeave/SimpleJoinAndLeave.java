package dev.eychro.simpleJoinAndLeave;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleJoinAndLeave extends JavaPlugin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        String dname = e.getPlayer().getDisplayName();
        e.setJoinMessage(ChatColor.GREEN + "+" + ChatColor.DARK_GRAY + dname);
    }
    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        String dname = e.getPlayer().getDisplayName();
        e.setQuitMessage(ChatColor.RED + "+" + ChatColor.DARK_GRAY + dname );
    }
}
