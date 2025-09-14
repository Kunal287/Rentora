package com.kunal.Rentora.controller;
import com.kunal.Rentora.dto.LoginRequest;
import com.kunal.Rentora.dto.RegisterRequest;
import com.kunal.Rentora.dto.UpdateUserRequest;
import com.kunal.Rentora.dto.UserResponse;
import com.kunal.Rentora.enums.Role;
import com.kunal.Rentora.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/users")
public class UserController {
    public UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    // ✅ 1. User Registration
    @PostMapping("/register")
    public ResponseEntity<UserResponse> registerUser(@RequestBody RegisterRequest request) {
        UserResponse response = userService.registerUser(request);
        return ResponseEntity.ok(response);
    }

    // ✅ 2. User Login
    @PostMapping("/login")
    public ResponseEntity<UserResponse> loginUser(@RequestBody LoginRequest request) {
        Optional<UserResponse> response = userService.loginUser(request);

        if (response.isPresent()) {
            return ResponseEntity.ok(response.get()); // unwrap the Optional
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build(); // 401 if not found / invalid
        }
    }

    // ✅ 3. View Profile (GET by ID)
    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserProfile(@PathVariable Long id) {
        UserResponse response = userService.getUserById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Profile does not exist"));

        return ResponseEntity.ok(response);
    }

    // ✅ 4. Update Profile
    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> updateUser(
            @PathVariable Long id,
            @RequestBody UpdateUserRequest request) {
        UserResponse response = userService.updateUser(id, request);
        return ResponseEntity.ok(response);
    }

    // ✅ 5. Delete Profile
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("User deleted successfully!");
    }


    @GetMapping("/role/{role}")
    public ResponseEntity<List<UserResponse>> getUsersByRole(@PathVariable String role) {
        Role userRole = Role.valueOf(role.toUpperCase()); // convert string to enum
        List<UserResponse> users = userService.getUsersByRole(userRole);
        return ResponseEntity.ok(users);
    }


}