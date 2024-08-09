package com.example.demo.service;

import com.example.demo.entities.Managerdetails;
import com.example.demo.entities.HRdetails;

public interface ManagerServ {
    Managerdetails getManager(Long Id);

    Managerdetails addManager(Managerdetails manager);

    Managerdetails findByUsername(String username);  // Add this method signature

    HRdetails getHR(Long hrId);  // Assuming this method exists in your service layer for HR fetching
}
