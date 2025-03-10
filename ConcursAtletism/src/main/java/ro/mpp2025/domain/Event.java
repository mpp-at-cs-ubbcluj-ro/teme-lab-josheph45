package ro.mpp2025.domain;

public class Event {
    private final String name;
    private final int distance;

    public Event(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
