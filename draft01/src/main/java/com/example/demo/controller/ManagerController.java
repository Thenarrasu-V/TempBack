package com.example.demo.controller;

import com.example.demo.entities.Managerdetails;
import com.example.demo.servimpl.ManagerImpl;
import com.example.demo.service.ManagerServ;  // Ensure this import is present
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerServ managerServ;  // Correctly reference the service interface

    @PostMapping("/login")
    public ResponseEntity<?> loginManager(@RequestParam String username, @RequestParam String password) {
        Managerdetails manager = managerServ.findByUsername(username);  // Use managerServ

        if (manager != null && manager.getPassword().equals(password)) {
            return ResponseEntity.ok(manager);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<Managerdetails> getManager(@PathVariable Long Id) {
        return ResponseEntity.ok(managerServ.getManager(Id));  // Use managerServ
    }

    @PostMapping("/add")
    public ResponseEntity<Managerdetails> addManager(@RequestBody Managerdetails manager, @RequestParam Long hr) {
        manager.setRole("manager");
        manager.setHr(managerServ.getHR(hr));  // Assuming you have an HR fetching method in the service layer
        Managerdetails ret = managerServ.addManager(manager);
        return new ResponseEntity<>(ret, HttpStatus.CREATED);
    }
}
