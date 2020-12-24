package com.mateo9x.restapi;

import com.mateo9x.restapi.domain.Car;
import com.mateo9x.restapi.domain.Exhaust;
import com.mateo9x.restapi.domain.Suspension;
import com.mateo9x.restapi.domain.Wheel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModelTest {

    @Test
    public void CarTest(){
        //given
        Car car = new Car();
        car.setBrand("Mitsubishi");
        car.setModel("Evo");
        car.setFuelType("Gas");
        //when
        String isBrandSame = car.getBrand();
        String isModelSame = car.getModel();
        String isFuelTypeSame = car.getFuelType();
        //then
        Assertions.assertEquals("Mitsubishi",isBrandSame);
        Assertions.assertEquals("Evo",isModelSame);
        Assertions.assertEquals("Gas",isFuelTypeSame);
    }

    @Test
    public void ExhaustTest(){
        //given
        Exhaust exhaust = new Exhaust();
        exhaust.setBrand("MGMotorsport");
        exhaust.setType("Catback");
        exhaust.setDiameter(2.5);
        //when
        String isBrandSame = exhaust.getBrand();
        String isTypeSame = exhaust.getType();
        Double isDiameterSame = exhaust.getDiameter();
        //then
        Assertions.assertEquals("MGMotorsport",isBrandSame);
        Assertions.assertEquals("Catback",isTypeSame);
        Assertions.assertEquals(2.5,isDiameterSame);
    }

    @Test
    public void WheelTest(){
        //given
        Wheel wheel = new Wheel();
        wheel.setBrand("Concaver");
        wheel.setSize(17);
        wheel.setWidth(8);
        //when
        String isBrandNotSame = wheel.getBrand();
        Integer isSizeNotSame = wheel.getSize();
        Integer isWidthNotSame = wheel.getWidth();
        //then
        Assertions.assertNotEquals("IDK",isBrandNotSame);
        Assertions.assertNotEquals(10,isSizeNotSame);
        Assertions.assertNotEquals(2,isWidthNotSame);
    }

    @Test
    public void SuspensionTest(){
        //given
        Suspension suspension = new Suspension();
        suspension.setBrand("Zawieszenie");
        suspension.setLoweredMeasure(50);
        //when
        String isBrandSame = suspension.getBrand();
        Integer isLoweredMeasureSame = suspension.getLoweredMeasure();
        //then
        Assertions.assertEquals("Zawieszenie",isBrandSame);
        Assertions.assertEquals(50,isLoweredMeasureSame);
    }
}
