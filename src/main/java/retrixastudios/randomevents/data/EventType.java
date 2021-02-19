package retrixastudios.randomevents.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum EventType {

    // Need to add more events.

    QUESTION,
    PUZZLE,
    INTERACT;

    private static final Random random = new Random();
    private static final int size = values().length;
    private static final List<EventType> values = Collections.unmodifiableList(Arrays.asList(values()));
    EventType() {}

    public static EventType getRandom() {
        return values.get(random.nextInt(size));
    }


}
