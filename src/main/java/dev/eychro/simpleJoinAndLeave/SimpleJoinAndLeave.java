package dev.eychro.simpleJoinAndLeave;

import dev.eychro.simpleJoinAndLeave.Utils.JoinAndLeaveListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleJoinAndLeave extends JavaPlugin implements Listener {
    public SimpleJoinAndLeave() {
    }

    public void onEnable() {
        this.saveDefaultConfig();
        this.ListenerLoader();
    }

    public void ListenerLoader() {
        this.getServer().getPluginManager().registerEvents(new JoinAndLeaveListener(this), this);
    }
}
