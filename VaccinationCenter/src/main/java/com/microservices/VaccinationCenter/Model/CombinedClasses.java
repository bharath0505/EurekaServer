package com.microservices.VaccinationCenter.Model;

import com.microservices.VaccinationCenter.Bean.VaccinationCenter;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Component
public class CombinedClasses {

    private VaccinationCenter center;

    private List<Citizen> citizens;

    public VaccinationCenter getCenter() {
        return center;
    }

    public void setCenter(VaccinationCenter center) {
        this.center = center;
    }

    public List<Citizen> getCitizens() {
        return citizens;
    }

    public void setCitizens(List<Citizen> citizens) {
        this.citizens = citizens;
    }
}
