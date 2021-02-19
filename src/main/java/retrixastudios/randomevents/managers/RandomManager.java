package retrixastudios.randomevents.managers;

import org.bukkit.Bukkit;
import retrixastudios.randomevents.RandomEvents;
import retrixastudios.randomevents.data.EventType;

import java.util.HashMap;
import java.util.UUID;

public class RandomManager {

    private HashMap<UUID, Long> randomEvents;

    public RandomManager() {
        randomEvents = new HashMap<UUID, Long>();
    }

    public void startRandomEvent(UUID player) {

        // TODO Check player not in combat / other invalid scenario.

        this.randomEvents.put(player, System.currentTimeMillis()); // Add the player to the random events list.
        EventType type = EventType.getRandom(); // Get a random event type to challenge the player with.

        switch(type) {
            case PUZZLE: {
                // Give the player a puzzle.
            }

            case INTERACT: {
                // Make the player interact with an entity / blocks.
            }

            case QUESTION: {
                // Give the user a question. Subject tbd.
            }
        }

        Bukkit.getScheduler().scheduleSyncDelayedTask(RandomEvents.getInstance(), () -> {
            if(randomEvents.containsKey(player)) this.randomEvents.remove(player);
        }, 30*20); // 30 x 20 ticks = 30 seconds.

    }


    public boolean hasEvent(UUID player) {
        return this.randomEvents.containsKey(player);
    }

}
