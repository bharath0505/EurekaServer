package com.microservices.CitizenService.repositories;

import com.microservices.CitizenService.bean.Citizen;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CitizenRepository extends MongoRepository<Citizen,Integer> {

    List<Citizen> findByVaccinationCenterId(int id);
}
