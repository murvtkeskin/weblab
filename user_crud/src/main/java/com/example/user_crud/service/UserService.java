package com.example.user_crud.service;

import java.util.List;
import java.util.Optional;

import com.example.user_crud.entity.User;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    void addUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
}