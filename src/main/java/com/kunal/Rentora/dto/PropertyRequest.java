package com.kunal.Rentora.dto;

import com.kunal.Rentora.enums.PropertyStatus;

import java.util.List;

public class PropertyRequest {
    private Long propertyId;
    private String propertyName;
    private String propertyOwner;
    private String propertyAddress;
    private String propertyCity;

    private String sellerContact;

    private Double propertyRent;

    private String propertyDescription;

    private List<String> amenities;

    private List<String> images;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getPropertyCity() {
        return propertyCity;
    }

    public void setPropertyCity(String propertyCity) {
        this.propertyCity = propertyCity;
    }

    public String getSellerContact() {
        return sellerContact;
    }

    public void setSellerContact(String sellerContact) {
        this.sellerContact = sellerContact;
    }

    public Double getPropertyRent() {
        return propertyRent;
    }

    public void setPropertyRent(Double propertyRent) {
        this.propertyRent = propertyRent;
    }

    public String getPropertyDescription() {
        return propertyDescription;
    }

    public void setPropertyDescription(String propertyDescription) {
        this.propertyDescription = propertyDescription;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public PropertyRequest(String propertyName, String propertyOwner, String propertyAddress, String propertyCity, String sellerContact, Double propertyRent, String propertyDescription, List<String> amenities, List<String> images) {
        this.propertyName = propertyName;
        this.propertyOwner = propertyOwner;
        this.propertyAddress = propertyAddress;
        this.propertyCity = propertyCity;
        this.sellerContact = sellerContact;
        this.propertyRent = propertyRent;
        this.propertyDescription = propertyDescription;
        this.amenities = amenities;
        this.images = images;
    }
}
