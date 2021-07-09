package com.microservices.VaccinationCenter.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "VaccinationCenter")
public class VaccinationCenter {

    @Id
    private int id;

    private String centerName;

    private String centerAddress;
}
