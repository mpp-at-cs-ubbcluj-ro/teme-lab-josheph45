package ro.mpp2025.domain;

import ro.mpp2025.utils.AgeConvertor;

public class Child {
    private final String name;
    private final String CNP;

    public Child(String name, String CNP) {
        this.name = name;
        this.CNP = CNP;
    }

    public String getName() {
        return name;
    }

    public String getCNP() {
        return CNP;
    }

    public int getAge() {
        return AgeConvertor.getAgeFromCNP(CNP);
    }
}
