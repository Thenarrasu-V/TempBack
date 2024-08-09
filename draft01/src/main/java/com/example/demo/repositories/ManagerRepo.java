package com.example.demo.repositories;

import com.example.demo.entities.Managerdetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepo extends JpaRepository<Managerdetails, Long> {
    Managerdetails findByUsername(String username);
}
