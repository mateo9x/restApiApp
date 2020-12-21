package com.mateo9x.restapi.services;


import com.mateo9x.restapi.api.PhoneDTO;
import com.mateo9x.restapi.api.model.PhoneListDTO;
import org.mapstruct.Mapper;

import java.util.List;

public interface PhoneService {

    List<PhoneDTO> getAllPhones();

    PhoneDTO getPhoneById(Long id);

    List<PhoneDTO> getPhonesByBrand(String brand);

    List<PhoneDTO> getPhonesByModel(String model);

    PhoneDTO addNewPhone(PhoneDTO phoneDTO);

    PhoneDTO updatePhone(Long id, PhoneDTO phoneDTO);

    void deletePhoneById(Long id);


}
