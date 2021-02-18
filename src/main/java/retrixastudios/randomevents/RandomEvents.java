package retrixastudios.randomevents;

import org.bukkit.plugin.java.JavaPlugin;

public final class RandomEvents extends JavaPlugin {

    /**
     * RandomEvents
     *
     * Emulate RuneScape Random-Events in order to reward legitimate players and interrupt illegitimate players.
     */

    private static RandomEvents instance;

    @Override
    public void onEnable() {

        saveDefaultConfig(); // Save default config.


        // Register Commands

        // Register Events

        // Start Tasks


        instance = this;
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static RandomEvents getInstance() {
        return instance;
    }
}
