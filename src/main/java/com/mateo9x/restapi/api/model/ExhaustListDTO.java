package com.mateo9x.restapi.api.model;

import com.mateo9x.restapi.api.ExhaustDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ExhaustListDTO {

    private List<ExhaustDTO> exhaustList;
}
