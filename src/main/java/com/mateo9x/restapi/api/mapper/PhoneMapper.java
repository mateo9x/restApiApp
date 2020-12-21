package com.mateo9x.restapi.api.mapper;

import com.mateo9x.restapi.api.PhoneDTO;
import com.mateo9x.restapi.domain.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PhoneMapper {

    PhoneMapper INSTANCE = Mappers.getMapper(PhoneMapper.class);

    PhoneDTO phoneToPhoneDTO(Phone phone);

    Phone phoneDTOToPhone(PhoneDTO phoneDTO);
}
