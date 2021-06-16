package com.pod3.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.pod3.onlinebanking.security.Role;


public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findByName(String name);
}