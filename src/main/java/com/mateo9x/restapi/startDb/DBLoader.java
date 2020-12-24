package com.mateo9x.restapi.startDb;

import com.mateo9x.restapi.domain.Car;
import com.mateo9x.restapi.domain.Exhaust;
import com.mateo9x.restapi.domain.Suspension;
import com.mateo9x.restapi.domain.Wheel;
import com.mateo9x.restapi.repositories.CarRepository;
import com.mateo9x.restapi.repositories.ExhaustRepository;
import com.mateo9x.restapi.repositories.SuspensionRepository;
import com.mateo9x.restapi.repositories.WheelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBLoader implements CommandLineRunner {

    SuspensionRepository suspensionRepository;
    CarRepository carRepository;
    ExhaustRepository exhaustRepository;
    WheelRepository wheelRepository;

    public DBLoader(SuspensionRepository suspensionRepository, CarRepository carRepository, ExhaustRepository exhaustRepository, WheelRepository wheelRepository) {
        this.suspensionRepository = suspensionRepository;
        this.carRepository = carRepository;
        this.exhaustRepository = exhaustRepository;
        this.wheelRepository = wheelRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //first model

        Suspension firstSuspension = new Suspension();
        firstSuspension.setBrand("Bilstein");
        firstSuspension.setLoweredMeasure(50);
        suspensionRepository.save(firstSuspension);

        Suspension secondSuspension = new Suspension();
        secondSuspension.setBrand("MTS");
        secondSuspension.setLoweredMeasure(45);
        suspensionRepository.save(secondSuspension);

        Suspension thirdSuspension = new Suspension();
        thirdSuspension.setBrand("Bilstein");
        thirdSuspension.setLoweredMeasure(40);
        suspensionRepository.save(thirdSuspension);

        Suspension fourthSuspension = new Suspension();
        fourthSuspension.setBrand("Eibach");
        fourthSuspension.setLoweredMeasure(40);
        suspensionRepository.save(fourthSuspension);

        //second model

        Car firstCar = new Car();
        firstCar.setBrand("Audi");
        firstCar.setModel("A3");
        firstCar.setFuelType("Diesel");
        carRepository.save(firstCar);

        Car secondCar = new Car();
        secondCar.setBrand("Opel");
        secondCar.setModel("Astra");
        secondCar.setFuelType("Gas");
        carRepository.save(secondCar);

        Car thirdCar = new Car();
        thirdCar.setBrand("Peugeot");
        thirdCar.setModel("206");
        thirdCar.setFuelType("Diesel");
        carRepository.save(thirdCar);

        //third model

        Exhaust firstExhaust = new Exhaust();
        firstExhaust.setBrand("Magnaflow");
        firstExhaust.setType("CatBack");
        firstExhaust.setDiameter(2.5);
        exhaustRepository.save(firstExhaust);

        Exhaust secondExhaust = new Exhaust();
        secondExhaust.setBrand("Magnaflow");
        secondExhaust.setType("Downpipe");
        secondExhaust.setDiameter(2.25);
        exhaustRepository.save(secondExhaust);

        Exhaust thirdExhaust = new Exhaust();
        thirdExhaust.setBrand("Armytrix");
        thirdExhaust.setType("TurboBack");
        thirdExhaust.setDiameter(2.75);
        exhaustRepository.save(thirdExhaust);

        //fourth model

        Wheel firstWheel = new Wheel();
        firstWheel.setBrand("JapanRacing");
        firstWheel.setSize(17);
        firstWheel.setWidth(8);
        wheelRepository.save(firstWheel);

        Wheel secondWheel = new Wheel();
        secondWheel.setBrand("Rotors");
        secondWheel.setSize(18);
        secondWheel.setWidth(8);
        wheelRepository.save(secondWheel);

        Wheel thirdWheel = new Wheel();
        thirdWheel.setBrand("OEM");
        thirdWheel.setSize(17);
        thirdWheel.setWidth(7);
        wheelRepository.save(thirdWheel);

    }
}
