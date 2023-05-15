package com.example.demo.mapper.impl;

import com.example.demo.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminMapper extends JpaRepository<Admin,Integer> {
    Admin findAdminsByAdminIdAndPassword(Integer id,String password);
}
