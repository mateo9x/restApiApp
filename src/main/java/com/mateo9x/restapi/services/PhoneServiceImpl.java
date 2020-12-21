package com.mateo9x.restapi.services;

import com.mateo9x.restapi.api.PhoneDTO;
import com.mateo9x.restapi.api.mapper.PhoneMapper;
import com.mateo9x.restapi.api.model.PhoneListDTO;
import com.mateo9x.restapi.domain.Phone;
import com.mateo9x.restapi.repositories.PhoneRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhoneServiceImpl implements PhoneService{

    PhoneRepository phoneRepository;
    PhoneMapper phoneMapper;

    public PhoneServiceImpl(PhoneRepository phoneRepository, PhoneMapper phoneMapper) {
        this.phoneRepository = phoneRepository;
        this.phoneMapper = phoneMapper;
    }

    @Override
    public List<PhoneDTO> getAllPhones() {
        return phoneRepository.findAll()
                .stream()
                .map(phoneMapper::phoneToPhoneDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PhoneDTO getPhoneById(Long id) {
        return phoneMapper.phoneToPhoneDTO(phoneRepository.findById(id).get());
    }

    @Override
    public List<PhoneDTO> getPhonesByBrand(String brand) {
        return phoneRepository.getPhonesByBrand(brand)
                .stream()
                .map(phoneMapper::phoneToPhoneDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<PhoneDTO> getPhonesByModel(String model) {
        return phoneRepository.getPhonesByModel(model)
                .stream()
                .map(phoneMapper::phoneToPhoneDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PhoneDTO addNewPhone(PhoneDTO phoneDTO) {
        Phone phone = phoneMapper.phoneDTOToPhone(phoneDTO);
        Phone savedPhone = phoneRepository.save(phone);
        return phoneMapper.phoneToPhoneDTO(savedPhone);
    }

    @Override
    public PhoneDTO updatePhone(Long id, PhoneDTO phoneDTO) {

        Phone phone = phoneMapper.phoneDTOToPhone(phoneDTO);
        phone.setId(id);
        Phone savedPhone = phoneRepository.save(phone);
        return phoneMapper.phoneToPhoneDTO(savedPhone);
    }

    @Override
    public void deletePhoneById(Long id) {
    phoneRepository.deleteById(id);
    }
}
