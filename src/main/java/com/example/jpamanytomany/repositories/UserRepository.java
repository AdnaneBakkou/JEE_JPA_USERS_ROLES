package com.example.jpamanytomany.repositories;

import com.example.jpamanytomany.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
User findByUsername(String userName);
}
