package com.mateo9x.restapi.controllers;

import com.mateo9x.restapi.api.SuspensionDTO;
import com.mateo9x.restapi.services.SuspensionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suspension/")
@CrossOrigin(origins = "http://localhost:4200")
public class SuspensionController {

    private final SuspensionService suspensionService;

    public SuspensionController(SuspensionService suspensionService) {
        this.suspensionService = suspensionService;
    }

    @GetMapping("showAll")
    @ResponseStatus(HttpStatus.OK)
    public List<SuspensionDTO> getAllSuspensions() {
        return suspensionService.getAllSuspensions();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public SuspensionDTO getSuspensionById(@PathVariable Long id) {
        return suspensionService.getSuspensionById(id);
    }

    @GetMapping("findByBrand/{brand}")
    @ResponseStatus(HttpStatus.OK)
    public List<SuspensionDTO> getSuspensionsByBrand(@PathVariable String brand) {

        return suspensionService.getSuspensionsByBrand(brand);
    }

    @GetMapping("findByModel/{loweredMeausre}")
    @ResponseStatus(HttpStatus.OK)
    public List<SuspensionDTO> getSuspensionsByLoweredMeasure(@PathVariable Integer loweredMeasure) {

        return suspensionService.getSuspensionsByLoweredMeasure(loweredMeasure);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SuspensionDTO addNewSuspension(@RequestBody SuspensionDTO suspensionDTO) {

        return suspensionService.addNewSuspension(suspensionDTO);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public SuspensionDTO updateSuspension(@PathVariable Long id, @RequestBody SuspensionDTO suspensionDTO) {

        return suspensionService.updateSuspension(id, suspensionDTO);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteSuspensionById(@PathVariable Long id) {
        suspensionService.deleteSuspensionById(id);
    }

}
