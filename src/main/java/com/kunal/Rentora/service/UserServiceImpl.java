package com.kunal.Rentora.service;

import com.kunal.Rentora.dto.LoginRequest;
import com.kunal.Rentora.dto.RegisterRequest;
import com.kunal.Rentora.dto.UpdateUserRequest;
import com.kunal.Rentora.dto.UserResponse;
import com.kunal.Rentora.enums.Role;
import com.kunal.Rentora.entity.User;
import com.kunal.Rentora.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  // constructor injection
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  // ✅ 1. Register new user
  @Override
  public UserResponse registerUser(RegisterRequest request) {

    Optional<User> existingUser = userRepository.findByUserEmail(request.getUserEmail());
    if(existingUser.isPresent()) {
      throw new RuntimeException("Email already registered!");
    }
    if (request.getUserPhoneNumber() == null || !request.getUserPhoneNumber().matches("^[0-9]{10}$")) {
      throw new RuntimeException("Please enter the correct phone number");
    }
    if (request.getUserEmail() == null || !request.getUserEmail().matches("^[A-Za-z0-9._%+-]+@(gmail\\.com|[A-Za-z0-9.-]+\\.[A-Za-z]{2,})$\n")){
      throw new RuntimeException("Please enter correct mail");
    }


    User user = new User(
            request.getUserFirstName(),
            request.getUserLastName(),
            request.getUserEmail(),
            request.getUserPassword(),  // 🔑 later encrypt
            request.getUserPhoneNumber(),
            request.getUserAddress(),
            request.getUserRole()
    );
    User savedUser = userRepository.save(user);
    return mapToResponse(savedUser);
  }


  // ✅ 2. Login user
  @Override
  public Optional<UserResponse> loginUser(LoginRequest request) {
    Optional<User> userOpt = userRepository.findByUserEmail(request.getUserEmail());


    if (userOpt.isPresent()) {
      User user = userOpt.get();
      if (user.getUserPassword().equals(request.getUserPassword())) {
        return Optional.of(mapToResponse(user));
      } else {
        throw new RuntimeException("Invalid password!");
      }
    } else {
      throw new RuntimeException("User not found!");
    }
  }
// ✅ 3. Get user profile
  @Override
  public Optional<UserResponse> getUserById(Long id) {
    User user = userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found with id " + id));
    return Optional.of(mapToResponse(user));
  }


  // ✅ 4. Update user profile
  @Override
  public UserResponse updateUser(Long id, UpdateUserRequest request) {
    User user = userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found with id " + id));

    // update only allowed fields
    if (request.getUserPhoneNumber() != null)
      user.setUserPhoneNumber(request.getUserPhoneNumber());
    if (request.getUserAddress() != null)
      user.setUserAddress(request.getUserAddress());
    if (request.getUserFirstName() != null)
      user.setUserFirstName(request.getUserFirstName());
    if (request.getUserLastName() != null)
      user.setUserLastName(request.getUserLastName());

    User updatedUser = userRepository.save(user);
    return mapToResponse(updatedUser);
  }

  @Override
  public List<UserResponse> getUsersByRole(Role role) {
    List<User> users = userRepository.findByUserRole(role);

    List<UserResponse> response = new ArrayList<>();
    for(User user: users){
      response.add(mapToResponse(user));
    }
    return response;
  }

  // ✅ 5. Delete user
  @Override
  public void deleteUser(Long id) {
    if (!userRepository.existsById(id)) {
      throw new RuntimeException("User not found with id " + id);
    }
    userRepository.deleteById(id);
  }

  // Utility: Convert User -> UserResponse DTO
  private UserResponse mapToResponse(User user) {
    return new UserResponse(
            user.getUserFirstName(),
            user.getUserLastName(),
            user.getUserEmail(),
            user.getUserRole(),
            user.getUserPhoneNumber(),
            user.getUserAddress()
    );
  }
}
