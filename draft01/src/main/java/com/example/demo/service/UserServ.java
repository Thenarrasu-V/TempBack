package com.example.demo.service;

import com.example.demo.entities.Userdetails;

public interface UserServ {
    Userdetails getUser(Long Id);
    Userdetails addUser(Userdetails user);
}
