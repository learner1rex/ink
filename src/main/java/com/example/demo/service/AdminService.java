package com.example.demo.service;

import com.example.demo.Entity.Admin;
import com.example.demo.mapper.impl.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
@RequestMapping(("/Admin"))
@CrossOrigin(allowedHeaders = {"*"})
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @PostMapping(value = "/login")
    public int login(@RequestParam(value = "AdminId") Integer adminId, @RequestParam(value = "password") String password){
        Admin admin = adminMapper.findAdminsByAdminIdAndPassword(adminId,password);
        if (admin != null){
            return 1;
        }
        else
        {
            return 0;
        }
    }

    @PostMapping(value = "register")
    public boolean register(@RequestBody Admin admin){
        try {
            adminMapper.save(admin);
        }catch (Exception e){
            return false;
        }finally {
            return true;
        }
    }

}
