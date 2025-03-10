package ro.mpp2025.domain;

public class AgeGroup {
    private final String name;
    private final int minAge;
    private final int maxAge;

    public AgeGroup(String name, int minAge, int maxAge) {
        this.name = name;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public Tuple<Integer, Integer> getAgeInterval() {
        return new Tuple<>(minAge, maxAge);
    }
}
