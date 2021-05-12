package com.spikes.vaccineManager.models;


public class Vaccine {
    private final String name;
    private final Boolean isUsed;


    public Vaccine(String name, Boolean isUsed) {
        this.name = name;
        this.isUsed = isUsed != null && isUsed;
    }

    public String getName() {
        return name;
    }

    public Boolean getUsed() {
        return isUsed;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                ", name='" + name + '\'' +
                ", isUsed=" + isUsed +
                '}';
    }
}