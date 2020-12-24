package com.mateo9x.restapi.api.mapper;

import com.mateo9x.restapi.api.ExhaustDTO;
import com.mateo9x.restapi.domain.Exhaust;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExhaustMapper {

    ExhaustMapper INSTANCE = Mappers.getMapper(ExhaustMapper.class);

    ExhaustDTO exhaustToExhaustDTO(Exhaust exhaust);

    Exhaust exhaustDTOToExhaust(ExhaustDTO exhaustDTO);
}
