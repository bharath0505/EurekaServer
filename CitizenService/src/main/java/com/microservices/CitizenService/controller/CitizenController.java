package com.microservices.CitizenService.controller;

import com.microservices.CitizenService.bean.Citizen;
import com.microservices.CitizenService.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

    @Autowired
    CitizenService citizenService;
//    @RequestMapping("/test")
////    public ResponseEntity<String> test()
////    {
////        return new ResponseEntity<>("Hello", HttpStatus.OK);
////    }

    @PostMapping("/addCitizen")
    public Citizen addCitizen(@RequestBody Citizen citizen)
    {
        return citizenService.addCitizen(citizen);
    }
    @GetMapping("/id/{id}")
    public  List<Citizen> getById(@PathVariable int id) {
      return  citizenService.findByVaccinationCenterId(id);
    }
    @GetMapping("/getAllCitizen")
    public List<Citizen> findAllCitizens()
    {
        return citizenService.findAllCitizen();
    }
}
