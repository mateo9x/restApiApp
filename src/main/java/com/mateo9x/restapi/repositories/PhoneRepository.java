package com.mateo9x.restapi.repositories;

import com.mateo9x.restapi.domain.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {

    List<Phone> getPhonesByBrand(String brand);
    List<Phone> getPhonesByModel(String model);
}
