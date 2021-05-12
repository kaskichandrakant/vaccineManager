package com.spikes.vaccineManager.models.Observers;

import com.spikes.vaccineManager.interfaces.Observer;
import com.spikes.vaccineManager.models.Vaccine;

import java.util.List;

public class Media implements Observer {

    @Override
    public void update(List<Vaccine> vaccines) {
        System.out.println("Media is updated" + vaccines.toString());
    }
}
