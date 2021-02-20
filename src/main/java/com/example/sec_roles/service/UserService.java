package com.example.sec_roles.service;


import com.example.sec_roles.dto.UserDto;
import com.example.sec_roles.entitiy.User;

import java.util.List;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
