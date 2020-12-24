package com.mateo9x.restapi.api.model;

import com.mateo9x.restapi.api.WheelDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class WheelListDTO {

    private List<WheelDTO> wheelList;
}
