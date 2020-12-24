package com.mateo9x.restapi.services;

import com.mateo9x.restapi.api.ExhaustDTO;
import com.mateo9x.restapi.api.mapper.ExhaustMapper;
import com.mateo9x.restapi.domain.Exhaust;
import com.mateo9x.restapi.repositories.ExhaustRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExhaustServiceImpl implements ExhaustService{

    ExhaustRepository exhaustRepository;
    ExhaustMapper exhaustMapper;

    public ExhaustServiceImpl(ExhaustRepository exhaustRepository, ExhaustMapper exhaustMapper) {
        this.exhaustRepository = exhaustRepository;
        this.exhaustMapper = exhaustMapper;
    }


    @Override
    public List<ExhaustDTO> getAllExhausts() {
        return exhaustRepository.findAll()
                .stream()
                .map(exhaustMapper::exhaustToExhaustDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ExhaustDTO getExhaustById(Long id) {
        return exhaustMapper.exhaustToExhaustDTO(exhaustRepository.findById(id).get());
    }

    @Override
    public List<ExhaustDTO> getExhaustsByBrand(String brand) {
        return exhaustRepository.getExhaustsByBrand(brand)
                .stream()
                .map(exhaustMapper::exhaustToExhaustDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ExhaustDTO> getExhaustsByType(String type) {
        return exhaustRepository.getExhaustsByType(type)
                .stream()
                .map(exhaustMapper::exhaustToExhaustDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ExhaustDTO> getExhaustsByDiameter(Double diameter) {
        return exhaustRepository.getExhaustsByDiameter(diameter)
                .stream()
                .map(exhaustMapper::exhaustToExhaustDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ExhaustDTO addNewExhaust(ExhaustDTO exhaustDTO) {
        Exhaust exhaust = exhaustMapper.exhaustDTOToExhaust(exhaustDTO);
        Exhaust savedExhaust = exhaustRepository.save(exhaust);
        return exhaustMapper.exhaustToExhaustDTO(savedExhaust);
    }

    @Override
    public ExhaustDTO updateExhaust(Long id, ExhaustDTO exhaustDTO) {
        Exhaust exhaust = exhaustMapper.exhaustDTOToExhaust(exhaustDTO);
        exhaust.setId(id);
        Exhaust savedExhaust = exhaustRepository.save(exhaust);
        return exhaustMapper.exhaustToExhaustDTO(savedExhaust);
    }

    @Override
    public void deleteExhaustById(Long id) {
        exhaustRepository.deleteById(id);
    }
}
