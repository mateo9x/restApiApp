package com.mateo9x.restapi.api.mapper;

import com.mateo9x.restapi.api.SuspensionDTO;
import com.mateo9x.restapi.domain.Suspension;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SuspensionMapper {

    SuspensionMapper INSTANCE = Mappers.getMapper(SuspensionMapper.class);

    SuspensionDTO suspensionToSuspensionDTO(Suspension suspension);

    Suspension suspensionDTOToSuspension(SuspensionDTO suspensionDTO);
}
