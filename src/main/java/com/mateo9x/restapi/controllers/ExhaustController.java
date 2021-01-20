package com.mateo9x.restapi.controllers;

import com.mateo9x.restapi.api.CarDTO;
import com.mateo9x.restapi.api.ExhaustDTO;
import com.mateo9x.restapi.services.ExhaustService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/exhaust/")
@CrossOrigin(origins = "http://localhost:4200")
public class ExhaustController {

    private final ExhaustService exhaustService;

    public ExhaustController(ExhaustService exhaustService) {
        this.exhaustService = exhaustService;
    }

    @GetMapping("showAll")
    @ResponseStatus(HttpStatus.OK)
    public List<ExhaustDTO> getAllExhausts() {
        return exhaustService.getAllExhausts();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public ExhaustDTO getExhaustById(@PathVariable Long id) {
        return exhaustService.getExhaustById(id);
    }

    @GetMapping("findByBrand/{brand}")
    @ResponseStatus(HttpStatus.OK)
    public List<ExhaustDTO> getExhaustsByBrand(@PathVariable String brand) {

        return exhaustService.getExhaustsByBrand(brand);
    }

    @GetMapping("findByModel/{type}")
    @ResponseStatus(HttpStatus.OK)
    public List<ExhaustDTO> getExhaustsByType(@PathVariable String type) {

        return exhaustService.getExhaustsByType(type);
    }

    @GetMapping("findByFuelType/{diameter}")
    @ResponseStatus(HttpStatus.OK)
    public List<ExhaustDTO> getExhaustsByDiameter(@PathVariable Double diameter) {

        return exhaustService.getExhaustsByDiameter(diameter);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ExhaustDTO addNewExhaust(@RequestBody ExhaustDTO exhaustDTO) {

        return exhaustService.addNewExhaust(exhaustDTO);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ExhaustDTO updateExhaust(@PathVariable Long id, @RequestBody ExhaustDTO exhaustDTO) {

        return exhaustService.updateExhaust(id, exhaustDTO);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteExhaustById(@PathVariable Long id) {
        exhaustService.deleteExhaustById(id);
    }

}
