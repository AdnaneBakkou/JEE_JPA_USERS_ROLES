package com.example.jpamanytomany.service;

import com.example.jpamanytomany.entities.Role;
import com.example.jpamanytomany.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUsername(String username);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String username , String roleName);
    User authenticate(String userName , String password);
}
