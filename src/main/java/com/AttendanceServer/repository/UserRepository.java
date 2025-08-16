package com.AttendanceServer.repository;

import com.AttendanceServer.entities.User;
import com.AttendanceServer.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User,Long> {

    User findByUserRole(UserRole role);

    Optional<User> findByEmail(String email);



}
