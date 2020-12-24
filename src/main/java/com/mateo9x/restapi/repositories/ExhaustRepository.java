package com.mateo9x.restapi.repositories;

import com.mateo9x.restapi.domain.Exhaust;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExhaustRepository extends JpaRepository<Exhaust, Long> {

    List<Exhaust> getExhaustsByBrand(String brand);
    List<Exhaust> getExhaustsByType(String type);
    List<Exhaust> getExhaustsByDiameter(Double diameter);

}
