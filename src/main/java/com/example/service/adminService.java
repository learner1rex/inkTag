package com.example.service;

import com.example.Entity.Admin;
import com.example.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class adminService implements IAdminService{

    @Autowired
    AdminRepository repository;

    @Override
    public List<Admin> findAll() {
        return (List<Admin>) repository.findAll();
    }


}
