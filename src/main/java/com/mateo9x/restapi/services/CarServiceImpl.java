package com.mateo9x.restapi.services;

import com.mateo9x.restapi.api.CarDTO;
import com.mateo9x.restapi.api.mapper.CarMapper;
import com.mateo9x.restapi.domain.Car;
import com.mateo9x.restapi.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    CarRepository carRepository;
    CarMapper carMapper;

    public CarServiceImpl(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    @Override
    public List<CarDTO> getAllCars() {
        return carRepository.findAll()
                .stream()
                .map(carMapper::carToCarDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CarDTO getCarById(Long id) {
        return carMapper.carToCarDTO(carRepository.findById(id).get());
    }

    @Override
    public List<CarDTO> getCarsByBrand(String brand) {
        return carRepository.getCarsByBrand(brand)
                .stream()
                .map(carMapper::carToCarDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<CarDTO> getCarsByModel(String model) {
        return carRepository.getCarsByModel(model)
                .stream()
                .map(carMapper::carToCarDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<CarDTO> getCarsByFuelType(String fuelType) {
        return carRepository.getCarsByFuelType(fuelType)
                .stream()
                .map(carMapper::carToCarDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CarDTO addNewCar(CarDTO carDTO) {
        Car car = carMapper.carDTOToCar(carDTO);
        Car savedCar = carRepository.save(car);
        return carMapper.carToCarDTO(savedCar);
    }

    @Override
    public CarDTO updateCar(Long id, CarDTO carDTO) {
        Car car = carMapper.carDTOToCar(carDTO);
        car.setId(id);
        Car savedCar = carRepository.save(car);
        return carMapper.carToCarDTO(savedCar);
    }

    @Override
    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }
}
