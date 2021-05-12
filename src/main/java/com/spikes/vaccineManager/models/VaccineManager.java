package com.spikes.vaccineManager.models;

import com.spikes.vaccineManager.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class VaccineManager {
    private List<Vaccine> vaccines = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public Boolean addVaccine(Vaccine vaccine) {
        this.vaccines.add(vaccine);
        return true;
    }

    public List<Vaccine> getVaccines() {
        return vaccines;
    }

    public void subscribe(Observer newObserver) {
        observers.add(newObserver);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(vaccines));
    }

    @Override
    public String toString() {
        return "VaccineManager{" +
                "vaccines=" + vaccines +
                "total vaccines=" + vaccines.size() +
                '}';
    }
}
