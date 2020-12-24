package com.mateo9x.restapi.api.mapper;

import com.mateo9x.restapi.api.WheelDTO;
import com.mateo9x.restapi.domain.Wheel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WheelMapper {

    WheelMapper INSTANCE = Mappers.getMapper(WheelMapper.class);

    WheelDTO wheelToWheelDTO (Wheel wheel);

    Wheel wheelDTOToWheel (WheelDTO wheelDTO);
}
