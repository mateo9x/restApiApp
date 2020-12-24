package com.mateo9x.restapi.services;

import com.mateo9x.restapi.api.CarDTO;

import java.util.List;

public interface CarService {

    List<CarDTO> getAllCars();

    CarDTO getCarById(Long id);

    List<CarDTO> getCarsByBrand(String brand);

    List<CarDTO> getCarsByModel(String model);

    List<CarDTO> getCarsByFuelType(String fuelType);

    CarDTO addNewCar(CarDTO carDTO);

    CarDTO updateCar(Long id, CarDTO carDTO);

    void deleteCarById(Long id);
}
