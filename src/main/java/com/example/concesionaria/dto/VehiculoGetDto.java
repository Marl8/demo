package com.example.concesionaria.dto;

import com.example.concesionaria.entity.Service;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehiculoGetDto {

    private int id;
    private String brand;
    private String model;
    private String manufacturingDate;
    private int numberOfKilometers;
    private int doors;
    private int price;
    private String currency;
    private int countOfOwners;
}