package com.mateo9x.restapi.repositories;

import com.mateo9x.restapi.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> getCarsByBrand(String brand);
    List<Car> getCarsByModel(String model);
    List<Car> getCarsByFuelType(String fuelType);
}
