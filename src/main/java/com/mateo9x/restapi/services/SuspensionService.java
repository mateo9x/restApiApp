package com.mateo9x.restapi.services;


import com.mateo9x.restapi.api.SuspensionDTO;

import java.util.List;

public interface SuspensionService {

    List<SuspensionDTO> getAllSuspensions();

    SuspensionDTO getSuspensionById(Long id);

    List<SuspensionDTO> getSuspensionsByBrand(String brand);

    List<SuspensionDTO> getSuspensionsByLoweredMeasure(Integer loweredMeasure);

    SuspensionDTO addNewSuspension(SuspensionDTO suspensionDTO);

    SuspensionDTO updateSuspension(Long id, SuspensionDTO suspensionDTO);

    void deleteSuspensionById(Long id);


}
