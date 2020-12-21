package com.mateo9x.restapi.controllers;

import com.mateo9x.restapi.api.PhoneDTO;
import com.mateo9x.restapi.api.model.PhoneListDTO;
import com.mateo9x.restapi.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/phone/")
public class PhoneController {

    private final PhoneService phoneService;

    public PhoneController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @GetMapping("showAll")
    @ResponseStatus(HttpStatus.OK)
    public List<PhoneDTO> getAllPhones() {
        return phoneService.getAllPhones();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public PhoneDTO getPhoneById(@PathVariable Long id) {
        return phoneService.getPhoneById(id);
    }

    @GetMapping("findByBrand/{brand}")
    @ResponseStatus(HttpStatus.OK)
    public List<PhoneDTO> getPhonesByBrand(@PathVariable String brand) {

        return phoneService.getPhonesByBrand(brand);
    }

    @GetMapping("findByModel/{model}")
    @ResponseStatus(HttpStatus.OK)
    public List<PhoneDTO> getPhonesByModel(@PathVariable String model) {

        return phoneService.getPhonesByModel(model);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PhoneDTO addNewPhone(@RequestBody PhoneDTO phoneDTO) {

        return phoneService.addNewPhone(phoneDTO);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public PhoneDTO updatePhone(@PathVariable Long id, @RequestBody PhoneDTO phoneDTO) {

        return phoneService.updatePhone(id, phoneDTO);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePhoneById(@PathVariable Long id) {
        phoneService.deletePhoneById(id);
    }

}
