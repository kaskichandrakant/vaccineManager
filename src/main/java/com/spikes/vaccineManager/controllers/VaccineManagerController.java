package com.spikes.vaccineManager.controllers;

import com.spikes.vaccineManager.models.Observers.GovernmentAgencies;
import com.spikes.vaccineManager.models.Observers.Media;
import com.spikes.vaccineManager.models.Vaccine;
import com.spikes.vaccineManager.models.VaccineManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class VaccineManagerController {
    private VaccineManager vaccineManager = new VaccineManager();

    @RequestMapping("/")
    public List<Vaccine> getVaccineIndex() {
        return vaccineManager.getVaccines();
    }

    @PostMapping("/")
    public Boolean addVaccines(@RequestBody List<Vaccine> vaccines) {
        for (Vaccine vaccine : vaccines) {
            vaccineManager.addVaccine(vaccine);
        }
        return true;
    }

    @PostMapping("/add-subscriber")
    public boolean addSubscriber() {
        GovernmentAgencies governmentAgencies = new GovernmentAgencies();
        Media media = new Media();
        vaccineManager.subscribe(governmentAgencies);
        vaccineManager.subscribe(media);
        return true;
    }

    @PostMapping("/notify-subscribers")
    public boolean notifySubscribers() {
        vaccineManager.notifyObservers();
        return true;
    }
}
