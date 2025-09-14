package com.kunal.Rentora.service;

import com.kunal.Rentora.dto.PropertyRequest;
import com.kunal.Rentora.dto.PropertyResponse;

import java.util.List;

public class PropertyServiceImpl implements PropertyService{
    @Override
    public PropertyResponse addProperty(PropertyRequest dto) {
        return null;
    }

    @Override
    public PropertyResponse updateProperty(Long id, PropertyRequest dto) {
        return null;
    }

    @Override
    public void deleteProperty(Long id) {

    }

    @Override
    public List<PropertyResponse> getAllProperties() {
        return null;
    }

    @Override
    public List<PropertyResponse> getPropertiesByCity(String city) {
        return null;
    }

    @Override
    public PropertyResponse getPropertyByName(String propertyName) {
        return null;
    }

    @Override
    public PropertyResponse getPropertyById(Long id) {
        return null;
    }
}
