package com.mateo9x.restapi.services;

import com.mateo9x.restapi.api.CarDTO;
import com.mateo9x.restapi.api.WheelDTO;
import com.mateo9x.restapi.domain.Wheel;

import java.util.List;

public interface WheelService {

    List<WheelDTO> getAllWheels();

    WheelDTO getWheelById(Long id);

    List<WheelDTO> getWheelsByBrand(String brand);

    List<WheelDTO> getWheelsBySize(Integer size);

    List<WheelDTO> getWheelsByWidth(Integer width);

    WheelDTO addNewWheel(WheelDTO wheelDTO);

    WheelDTO updateWheel(Long id, WheelDTO wheelDTO);

    void deleteWheelById(Long id);

}
