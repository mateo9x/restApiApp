package com.mateo9x.restapi.repositories;

import com.mateo9x.restapi.domain.Wheel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WheelRepository extends JpaRepository<Wheel, Long> {

    List<Wheel> getWheelsByBrand(String brand);
    List<Wheel> getWheelsBySize(Integer wheelSize);
    List<Wheel> getWheelsByWidth(Integer wheelWidth);

}
