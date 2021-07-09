package com.microservices.VaccinationCenter.Controller;

import com.microservices.VaccinationCenter.Bean.VaccinationCenter;
import com.microservices.VaccinationCenter.Model.Citizen;
import com.microservices.VaccinationCenter.Model.CombinedClasses;
import com.microservices.VaccinationCenter.Repositories.CenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/vaccinationCenter")
public class VaccinationCenterController {

    @Autowired
    CenterRepository repo;
    @Autowired
    RestTemplate restTemplate;
  @PostMapping("/addCenter")
   public ResponseEntity<VaccinationCenter> addCenter(@RequestBody VaccinationCenter vc)
  {
      VaccinationCenter vaccinationCenters = repo.save(vc);
      return new ResponseEntity<>(vaccinationCenters,HttpStatus.OK);
  }
  @GetMapping("/id/{id}")
    public ResponseEntity<CombinedClasses> getAllDataBasedOnCenterId(@PathVariable int id){
      CombinedClasses combinedClasses = new CombinedClasses();
      VaccinationCenter vaccinationCenter=repo.findById(id).get();
     combinedClasses.setCenter(vaccinationCenter);

     List<Citizen> citizens =restTemplate.getForObject("http://Citizen-Service/citizen/id/"+id,List.class);
      combinedClasses.setCitizens(citizens);
     return new ResponseEntity<>(combinedClasses,HttpStatus.OK);
  }
}
