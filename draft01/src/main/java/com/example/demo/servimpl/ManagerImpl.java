package com.example.demo.servimpl;

import com.example.demo.entities.Managerdetails;
import com.example.demo.repositories.ManagerRepo;
import com.example.demo.service.ManagerServ;
import com.example.demo.entities.HRdetails;  // Import HRdetails
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerImpl implements ManagerServ {

    @Autowired
    private ManagerRepo managerRepo;

    @Autowired
    private HRImpl hrService;  // Assuming HRImpl has a method to fetch HR details

    @Override
    public Managerdetails getManager(Long Id) {
        return managerRepo.findById(Id).orElse(null);
    }

    @Override
    public Managerdetails addManager(Managerdetails manager) {
        return managerRepo.save(manager);
    }

    @Override
    public Managerdetails findByUsername(String username) {
        return managerRepo.findByUsername(username);
    }

    @Override
    public HRdetails getHR(Long hrId) {
        return hrService.getHR(hrId);  // Adjust as necessary to match your HR fetching logic
    }
}
