package com.spikes.vaccineManager.interfaces;

import com.spikes.vaccineManager.models.Vaccine;

import java.util.List;

public interface Observer {
    void update(List<Vaccine> vaccines);
}
