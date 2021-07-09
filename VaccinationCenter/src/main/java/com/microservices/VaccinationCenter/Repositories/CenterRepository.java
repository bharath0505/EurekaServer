package com.microservices.VaccinationCenter.Repositories;

import com.microservices.VaccinationCenter.Bean.VaccinationCenter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CenterRepository extends MongoRepository<VaccinationCenter,Integer> {
}
