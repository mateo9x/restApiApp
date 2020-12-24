package com.mateo9x.restapi.repositories;

import com.mateo9x.restapi.domain.Suspension;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuspensionRepository extends JpaRepository<Suspension, Long> {

    List<Suspension> getSuspensionsByBrand(String brand);
    List<Suspension> getSuspensionsByLoweredMeasure(Integer loweredMeasure);
}
