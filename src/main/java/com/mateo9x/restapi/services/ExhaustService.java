package com.mateo9x.restapi.services;

import com.mateo9x.restapi.api.CarDTO;
import com.mateo9x.restapi.api.ExhaustDTO;

import java.util.List;

public interface ExhaustService {

    List<ExhaustDTO> getAllExhausts();

    ExhaustDTO getExhaustById(Long id);

    List<ExhaustDTO> getExhaustsByBrand(String brand);

    List<ExhaustDTO> getExhaustsByType(String type);

    List<ExhaustDTO> getExhaustsByDiameter(Double diameter);

    ExhaustDTO addNewExhaust(ExhaustDTO exhaustDTO);

    ExhaustDTO updateExhaust(Long id, ExhaustDTO exhaustDTO);

    void deleteExhaustById(Long id);
}
