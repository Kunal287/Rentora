package com.kunal.Rentora.entity;

import com.kunal.Rentora.enums.Role;
import jakarta.persistence.*;



@Entity
@Table(name = "users")  // good practice: plural table name
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userID;

    @Column(nullable = false,name = "user_first_name")
    private String userFirstName;

    @Column(nullable = false, name = "user_last_name")
    private String userLastName;

    @Column(nullable = false, unique = true, name = "user_email")
    private String userEmail;

    @Column(nullable = false, name = "user_password")
    private String userPassword;

    @Column(nullable = false, name = "user_role")
    @Enumerated(EnumType.STRING)
    private Role userRole; // "BUYER" or "SELLER"
    @Column(nullable = false, name = "user_phone")
    private String userPhoneNumber;

    @Column(nullable = false, name = "user_address")
    private String userAddress;


    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public User(){

    }

    public User(String userFirstName, String userLastName ,String userEmail, String userPassword, String userPhoneNumber, String userAddress, Role userRole) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userPhoneNumber = userPhoneNumber;
        this.userAddress = userAddress;
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRole='" + userRole + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }
}
