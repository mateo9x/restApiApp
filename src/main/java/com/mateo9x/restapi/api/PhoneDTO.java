package com.mateo9x.restapi.api;

import com.mateo9x.restapi.domain.Phone;
import lombok.Data;

@Data
public class PhoneDTO {

    Long id;
    String brand;
    String model;

}
