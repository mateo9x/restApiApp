package com.mateo9x.restapi.api.model;

import com.mateo9x.restapi.api.SuspensionDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SuspensionListDTO {

    private List<SuspensionDTO> suspensionList;
}
