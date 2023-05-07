package com.example.controller;

import com.example.Entity.Admin;
import com.example.service.IAdminService;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Controller
public class MyController {
    @Autowired
    private IAdminService adminService;

    @GetMapping("/showAdmins")
    public String findAdmins(){
        List<Admin> admins = adminService.findAll();
        for (Admin admin : admins) {
            System.out.println(admin);
        }
        return "showAdmins";
    }
}
