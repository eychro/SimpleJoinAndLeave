package dev.eychro.simpleJoinAndLeave.Utils;

import dev.eychro.simpleJoinAndLeave.SimpleJoinAndLeave;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinAndLeaveListener implements Listener {
    private final SimpleJoinAndLeave plugin;

    public JoinAndLeaveListener(SimpleJoinAndLeave plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        String joinMessage = this.plugin.getConfig().getString("join-message");
        if (joinMessage != null) {
            joinMessage = joinMessage.replace("<player>", e.getPlayer().getDisplayName());
            e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', joinMessage));
        }

    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        String leaveMessage = this.plugin.getConfig().getString("leave-message");
        if (leaveMessage != null) {
            leaveMessage = leaveMessage.replace("<player>", e.getPlayer().getDisplayName());
            e.setQuitMessage(ChatColor.translateAlternateColorCodes('&', leaveMessage));
        }

    }
}

