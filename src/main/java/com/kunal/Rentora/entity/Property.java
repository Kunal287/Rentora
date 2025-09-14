package com.kunal.Rentora.entity;

import com.kunal.Rentora.enums.PropertyStatus;
import jakarta.persistence.*;

import java.util.List;

public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "property_id")
    private Long propertyId;

    @Column(nullable = false, name = "property_name")
    private String propertyName;

    @Column(nullable = false, name = "property_owner")
    private String propertyOwner;

    @Column(nullable = false, name = "property_address")
    private String propertyAddress;

    @Column(nullable = false, name = "property_city")
    private String propertyCity;

    @Column(nullable = false, name = "seller_contact")
    private String sellerContact;

    @Column(nullable = false, name = "property_rent")
    private Double propertyRent;
    @Column(nullable = false,name = "property_description")
    private String propertyDescription;

    @Column(nullable = false, name = "property_status")
    @Enumerated(EnumType.STRING)
    private PropertyStatus propertyStatus = PropertyStatus.Vacant;

    @ElementCollection
    @CollectionTable(name = "property_amenities", joinColumns = @JoinColumn(name = "property_id"))
    @Column(name = "amenities")
    private List<String> amenities;

    @ElementCollection
    @CollectionTable(name = "property_images", joinColumns = @JoinColumn(name = "property_id"))
    @Column(name = "images")
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

    public PropertyStatus getPropertyStatus() {
        return propertyStatus;
    }

    public void setPropertyStatus(PropertyStatus propertyStatus) {
        this.propertyStatus = propertyStatus;
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

    public Property(String propertyName, String propertyOwner, String propertyAddress, String propertyCity, String sellerContact, Double propertyRent, String propertyDescription, PropertyStatus propertyStatus, List<String> amenities, List<String> images) {
        this.propertyName = propertyName;
        this.propertyOwner = propertyOwner;
        this.propertyAddress = propertyAddress;
        this.propertyCity = propertyCity;
        this.sellerContact = sellerContact;
        this.propertyRent = propertyRent;
        this.propertyDescription = propertyDescription;
        this.propertyStatus = propertyStatus;
        this.amenities = amenities;
        this.images = images;
    }

    @Override
    public String toString() {
        return "Property{" +
                "propertyId=" + propertyId +
                ", propertyName='" + propertyName + '\'' +
                ", propertyOwner='" + propertyOwner + '\'' +
                ", propertyAddress='" + propertyAddress + '\'' +
                ", propertyCity='" + propertyCity + '\'' +
                ", sellerContact='" + sellerContact + '\'' +
                ", propertyRent=" + propertyRent +
                ", propertyDescription='" + propertyDescription + '\'' +
                ", propertyStatus=" + propertyStatus +
                ", amenities=" + amenities +
                ", images=" + images +
                '}';
    }
}
