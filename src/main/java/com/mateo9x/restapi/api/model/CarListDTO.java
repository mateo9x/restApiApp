package com.mateo9x.restapi.api.model;

import com.mateo9x.restapi.api.CarDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CarListDTO {

    private List<CarDTO> carList;
}
