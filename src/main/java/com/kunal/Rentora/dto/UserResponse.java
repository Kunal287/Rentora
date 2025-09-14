package com.kunal.Rentora.dto;

import com.kunal.Rentora.enums.Role;

public class UserResponse {
  private String userFirstName;
  private String userLastName;
  private String userEmail;
  private Role userRole;
  private String userPhoneNumber;
  private  String userAddress;


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

  public UserResponse(String userFirstName, String userLastName, String userEmail, Role userRole, String userPhoneNumber, String userAddress) {
    this.userFirstName = userFirstName;
    this.userLastName = userLastName;
    this.userEmail = userEmail;
    this.userRole = userRole;
    this.userPhoneNumber = userPhoneNumber;
    this.userAddress = userAddress;
  }
}
