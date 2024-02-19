package com.example.spring.security.client.service;

import com.example.spring.security.client.entity.User;
import com.example.spring.security.client.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);
}
