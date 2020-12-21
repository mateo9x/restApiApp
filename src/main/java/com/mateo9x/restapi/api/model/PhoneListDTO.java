package com.mateo9x.restapi.api.model;

import com.mateo9x.restapi.api.PhoneDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PhoneListDTO {

    private List<PhoneDTO> phoneList;
}
