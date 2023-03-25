package com.example.authservice.repository;

import com.example.authservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;


public interface UserRepo extends JpaRepository<User,Long> {

    Optional<User> findUserByUsername(String username);

}
