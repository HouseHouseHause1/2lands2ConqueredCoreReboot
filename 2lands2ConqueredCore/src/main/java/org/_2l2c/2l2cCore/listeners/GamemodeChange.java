package org.l2x9.l2x9core.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.l2x9.l2x9core.Main;

public class GamemodeChange implements Listener {
    Main plugin;

    public GamemodeChange(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onGamemodeChange(PlayerGameModeChangeEvent event) {
    }
}
