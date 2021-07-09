package com.microservices.VaccinationCenter.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "citizen")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {

    @Id
    private int id;
    @Field
    private String name;
    @Field
    private int vaccinationCenterId;
}
