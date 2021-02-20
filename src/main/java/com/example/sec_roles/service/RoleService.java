package com.example.sec_roles.service;


import com.example.sec_roles.entitiy.Role;

public interface RoleService {
    Role findByName(String name);
}
