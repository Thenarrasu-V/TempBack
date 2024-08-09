package com.example.demo.servimpl;

import com.example.demo.entities.Userdetails;
import com.example.demo.repositories.UserRepo;
import com.example.demo.service.UserServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserServ {

    @Autowired
    private UserRepo userRepo;

    @Override
    public Userdetails getUser(Long Id) {
        return userRepo.findById(Id).orElse(null);
    }

    @Override
    public Userdetails addUser(Userdetails user) {
        return userRepo.save(user);
    }

    public Userdetails findByUsernameAndPassword(String username, String password) {
        return userRepo.findByUsernameAndPassword(username, password);
    }
}
