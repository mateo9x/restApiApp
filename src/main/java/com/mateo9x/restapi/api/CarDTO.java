package com.mateo9x.restapi.api;

import lombok.Data;

@Data
public class CarDTO {

    private Long id;
    private String brand;
    private String model;
    private String fuelType;
}
