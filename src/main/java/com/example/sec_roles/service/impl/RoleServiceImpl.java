package com.example.sec_roles.service.impl;


import com.example.sec_roles.dao.RoleDao;
import com.example.sec_roles.entitiy.Role;
import com.example.sec_roles.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role findByName(String name) {
        Role role = roleDao.findRoleByName(name);
        return role;
    }
}
