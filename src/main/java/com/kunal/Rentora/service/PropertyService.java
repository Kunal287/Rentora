package com.kunal.Rentora.service;

import com.kunal.Rentora.dto.PropertyRequest;
import com.kunal.Rentora.dto.PropertyResponse;

import java.util.List;

public interface PropertyService {
    PropertyResponse addProperty(PropertyRequest dto);
    PropertyResponse updateProperty(Long id, PropertyRequest dto);
    void deleteProperty(Long id);
    List<PropertyResponse> getAllProperties();
    List<PropertyResponse> getPropertiesByCity(String city);
    PropertyResponse getPropertyByName(String propertyName);
    PropertyResponse getPropertyById(Long id);

}
