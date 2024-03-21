package com.example.jpamanytomany.repositories;

import com.example.jpamanytomany.entities.Role;
import com.example.jpamanytomany.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
Role findByRoleName(String roleName);
}
