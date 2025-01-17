package com.edu.qnu.major.service;

import org.springframework.stereotype.Service;

import com.edu.qnu.major.model.User;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> getAllUser();
    void updateUser(User user);
    void removeUserById(int id);
    Optional<User> getUserById(int id);
    Optional<User> getUserByEmail(String email);
}
