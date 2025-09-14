package com.kunal.Rentora.service;
import com.kunal.Rentora.dto.LoginRequest;
import com.kunal.Rentora.dto.RegisterRequest;
import com.kunal.Rentora.dto.UpdateUserRequest;
import com.kunal.Rentora.dto.UserResponse;
import com.kunal.Rentora.enums.Role;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserResponse registerUser(RegisterRequest registerRequest);

    // Login user
    Optional<UserResponse> loginUser(LoginRequest loginRequest);

    // Update user details
    UserResponse updateUser(Long userId, UpdateUserRequest updateRequest);

    // Get all users by role (OWNER / TENANT)
    List<UserResponse> getUsersByRole(Role role);

    // Get user by ID
    Optional<UserResponse> getUserById(Long userId);


    // ✅ 5. Delete user
    void deleteUser(Long id);


}
