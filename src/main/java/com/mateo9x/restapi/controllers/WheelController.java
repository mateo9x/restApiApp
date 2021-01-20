package com.mateo9x.restapi.controllers;

import com.mateo9x.restapi.api.SuspensionDTO;
import com.mateo9x.restapi.api.WheelDTO;
import com.mateo9x.restapi.domain.Wheel;
import com.mateo9x.restapi.services.WheelService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/wheel/")
@CrossOrigin(origins = "http://localhost:4200")
public class WheelController {

    private final WheelService wheelService;

    public WheelController(WheelService wheelService) {
        this.wheelService = wheelService;
    }

    @GetMapping("showAll")
    @ResponseStatus(HttpStatus.OK)
    public List<WheelDTO> getAllWheels() {
        return wheelService.getAllWheels();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public WheelDTO getWheelById(@PathVariable Long id) {
        return wheelService.getWheelById(id);
    }

    @GetMapping("findByBrand/{brand}")
    @ResponseStatus(HttpStatus.OK)
    public List<WheelDTO> getWheelsByBrand(@PathVariable String brand) {

        return wheelService.getWheelsByBrand(brand);
    }

    @GetMapping("findByModel/{size}")
    @ResponseStatus(HttpStatus.OK)
    public List<WheelDTO> getWheelsBySize(@PathVariable Integer size) {

        return wheelService.getWheelsBySize(size);
    }

    @GetMapping("findByModel/{width}")
    @ResponseStatus(HttpStatus.OK)
    public List<WheelDTO> getWheelsByWidth(@PathVariable Integer width) {

        return wheelService.getWheelsByWidth(width);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public WheelDTO addNewWheel(@RequestBody WheelDTO wheelDTO) {

        return wheelService.addNewWheel(wheelDTO);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public WheelDTO updateWheel(@PathVariable Long id, @RequestBody WheelDTO wheelDTO) {

            return wheelService.updateWheel(id, wheelDTO);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePhoneById(@PathVariable Long id) { wheelService.deleteWheelById(id);
    }
}
