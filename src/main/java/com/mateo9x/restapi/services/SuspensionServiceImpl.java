package com.mateo9x.restapi.services;

import com.mateo9x.restapi.api.SuspensionDTO;
import com.mateo9x.restapi.api.mapper.SuspensionMapper;
import com.mateo9x.restapi.domain.Suspension;
import com.mateo9x.restapi.repositories.SuspensionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SuspensionServiceImpl implements SuspensionService {

    SuspensionRepository suspensionRepository;
    SuspensionMapper suspensionMapper;

    public SuspensionServiceImpl(SuspensionRepository suspensionRepository, SuspensionMapper suspensionMapper) {
        this.suspensionRepository = suspensionRepository;
        this.suspensionMapper = suspensionMapper;
    }

    @Override
    public List<SuspensionDTO> getAllSuspensions() {
        return suspensionRepository.findAll()
                .stream()
                .map(suspensionMapper::suspensionToSuspensionDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SuspensionDTO getSuspensionById(Long id) {
        return suspensionMapper.suspensionToSuspensionDTO(suspensionRepository.findById(id).get());
    }

    @Override
    public List<SuspensionDTO> getSuspensionsByBrand(String brand) {
        return suspensionRepository.getSuspensionsByBrand(brand)
                .stream()
                .map(suspensionMapper::suspensionToSuspensionDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<SuspensionDTO> getSuspensionsByLoweredMeasure(Integer loweredMeasure) {
        return suspensionRepository.getSuspensionsByLoweredMeasure(loweredMeasure)
                .stream()
                .map(suspensionMapper::suspensionToSuspensionDTO)
                .collect(Collectors.toList());
    }


    @Override
    public SuspensionDTO addNewSuspension(SuspensionDTO suspensionDTO) {
        Suspension suspension = suspensionMapper.suspensionDTOToSuspension(suspensionDTO);
        Suspension savedSuspension = suspensionRepository.save(suspension);
        return suspensionMapper.suspensionToSuspensionDTO(savedSuspension);
    }

    @Override
    public SuspensionDTO updateSuspension(Long id, SuspensionDTO suspensionDTO) {

        Suspension suspension = suspensionMapper.suspensionDTOToSuspension(suspensionDTO);
        suspension.setId(id);
        Suspension savedSuspension = suspensionRepository.save(suspension);
        return suspensionMapper.suspensionToSuspensionDTO(savedSuspension);
    }

    @Override
    public void deleteSuspensionById(Long id) {
        suspensionRepository.deleteById(id);
    }
}
