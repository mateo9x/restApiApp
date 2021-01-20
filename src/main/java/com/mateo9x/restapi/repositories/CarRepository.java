package com.mateo9x.restapi.repositories;

import com.mateo9x.restapi.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> getCarsByBrand(String brand);
    List<Car> getCarsByModel(String model);
    List<Car> getCarsByFuelType(String fuelType);
}
