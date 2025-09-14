package com.kunal.Rentora.repository;

import com.kunal.Rentora.entity.Property;
import com.kunal.Rentora.enums.PropertyStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyRepository extends JpaRepository<Property, Long> {


    List<Property> findPropertyByCity(String propertyCity);
    List<Property> findPropertyByName(String propertyName);

}
