package com.microservices.CitizenService.service;

import com.microservices.CitizenService.bean.Citizen;
import com.microservices.CitizenService.repositories.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenService {

    @Autowired
    CitizenRepository repo;

    public List<Citizen> findByVaccinationCenterId(int id) {
        return repo.findByVaccinationCenterId(id);
    }
    public Citizen addCitizen(Citizen citizen)
    {
        return repo.save(citizen);
    }

    public List<Citizen> findAllCitizen() {
        return repo.findAll();
    }
}
