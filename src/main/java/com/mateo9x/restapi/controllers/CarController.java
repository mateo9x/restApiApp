package com.mateo9x.restapi.controllers;

import com.mateo9x.restapi.api.CarDTO;
import com.mateo9x.restapi.services.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car/")
@CrossOrigin(origins = "http://localhost:4200")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("showAll")
    @ResponseStatus(HttpStatus.OK)
    public List<CarDTO> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public CarDTO getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @GetMapping("findByBrand/{brand}")
    @ResponseStatus(HttpStatus.OK)
    public List<CarDTO> getCarsByBrand(@PathVariable String brand) {
        return carService.getCarsByBrand(brand);
    }

    @GetMapping("findByModel/{model}")
    @ResponseStatus(HttpStatus.OK)
    public List<CarDTO> getCarsByModel(@PathVariable String model) {
        return carService.getCarsByModel(model);
    }

    @GetMapping("findByFuelType/{fuelType}")
    @ResponseStatus(HttpStatus.OK)
    public List<CarDTO> getCarsByFuelType(@PathVariable String fuelType) {

        return carService.getCarsByFuelType(fuelType);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CarDTO addNewCar(@RequestBody CarDTO carDTO) {

        return carService.addNewCar(carDTO);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public CarDTO updateCar(@PathVariable Long id, @RequestBody CarDTO carDTO) {

        return carService.updateCar(id, carDTO);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCarById(@PathVariable Long id) {
        carService.deleteCarById(id);
    }
}
