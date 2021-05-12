package com.spikes.vaccineManager;

import com.spikes.vaccineManager.models.Vaccine;
import com.spikes.vaccineManager.models.VaccineManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VaccineManagerApplicationTests {

    @Test
    void contextLoads() {

    }
    @Test
    public void addVaccine(){
        VaccineManager vaccineManager = new VaccineManager();
        Vaccine vaccine = new Vaccine("covaxin",false);
        vaccineManager.addVaccine(vaccine);
        assert vaccineManager.getVaccines().size() == 1;
    }
}
