package com.kunal.Rentora.repository;

import com.kunal.Rentora.enums.Role;
import com.kunal.Rentora.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUserEmail(String email);
    List<User> findByUserRole(Role role);

}
