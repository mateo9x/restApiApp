package com.mateo9x.restapi.api.mapper;

import com.mateo9x.restapi.api.CarDTO;
import com.mateo9x.restapi.domain.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDTO carToCarDTO (Car car);

    Car carDTOToCar (CarDTO carDTO);
}
