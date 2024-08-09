package com.example.demo.controller;

import com.example.demo.entities.Userdetails;
import com.example.demo.service.UserServ;
import com.example.demo.servimpl.HRImpl;
import com.example.demo.servimpl.ManagerImpl;
import com.example.demo.servimpl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserImpl userService;

    @Autowired
    private HRImpl hrService;

    @Autowired
    private ManagerImpl managerService;

    @PostMapping("/signIn")
    public ResponseEntity<Userdetails> signIn(@RequestParam String username, @RequestParam String password) {
        Userdetails user = userService.findByUsernameAndPassword(username, password);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<Userdetails> getUser(@PathVariable Long Id) {
        return ResponseEntity.ok(userService.getUser(Id));
    }

    @PostMapping("/add")
    public ResponseEntity<Userdetails> addUser(@RequestBody Userdetails user, @RequestParam Long hr, @RequestParam Long manager) {
        user.setRole("employee");
        user.setHr(hrService.getHR(hr));
        user.setManager(managerService.getManager(manager));
        Userdetails ret = userService.addUser(user);
        return new ResponseEntity<>(ret, HttpStatus.CREATED);
    }
}
