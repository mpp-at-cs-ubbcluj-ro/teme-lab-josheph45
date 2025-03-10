package ro.mpp2025.domain;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {
    private Child child;
    private List<Event> events = new ArrayList<>();

    public Enrollment(Child child, List<Event> events) {
        this.child = child;
        this.events = events;
    }
}
