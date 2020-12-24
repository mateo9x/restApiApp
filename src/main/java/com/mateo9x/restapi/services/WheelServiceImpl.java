package com.mateo9x.restapi.services;

import com.mateo9x.restapi.api.WheelDTO;
import com.mateo9x.restapi.api.mapper.WheelMapper;
import com.mateo9x.restapi.domain.Wheel;
import com.mateo9x.restapi.repositories.WheelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WheelServiceImpl implements WheelService{

    WheelRepository wheelRepository;
    WheelMapper wheelMapper;

    public WheelServiceImpl(WheelRepository wheelRepository, WheelMapper wheelMapper) {
        this.wheelRepository = wheelRepository;
        this.wheelMapper = wheelMapper;
    }

    @Override
    public List<WheelDTO> getAllWheels() {
        return wheelRepository.findAll()
                .stream()
                .map(wheelMapper::wheelToWheelDTO)
                .collect(Collectors.toList());
    }

    @Override
    public WheelDTO getWheelById(Long id) {
        return wheelMapper.wheelToWheelDTO(wheelRepository.findById(id).get());
    }

    @Override
    public List<WheelDTO> getWheelsByBrand(String brand) {
        return wheelRepository.getWheelsByBrand(brand)
                .stream()
                .map(wheelMapper::wheelToWheelDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<WheelDTO> getWheelsBySize(Integer size) {
        return wheelRepository.getWheelsBySize(size)
                .stream()
                .map(wheelMapper::wheelToWheelDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<WheelDTO> getWheelsByWidth(Integer width) {
        return wheelRepository.getWheelsByWidth(width)
                .stream()
                .map(wheelMapper::wheelToWheelDTO)
                .collect(Collectors.toList());
    }

    @Override
    public WheelDTO addNewWheel(WheelDTO wheelDTO) {
        Wheel wheel = wheelMapper.wheelDTOToWheel(wheelDTO);
        Wheel savedWheel = wheelRepository.save(wheel);
        return wheelMapper.wheelToWheelDTO(savedWheel);
    }

    @Override
    public WheelDTO updateWheel(Long id, WheelDTO wheelDTO) {
        Wheel wheel = wheelMapper.wheelDTOToWheel(wheelDTO);
        wheel.setId(id);
        Wheel savedWheel = wheelRepository.save(wheel);
        return wheelMapper.wheelToWheelDTO(savedWheel);
    }

    @Override
    public void deleteWheelById(Long id) {
        wheelRepository.deleteById(id);
    }
}
