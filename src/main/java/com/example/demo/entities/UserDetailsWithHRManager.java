package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "UserDetailsWithHRManager")
public class UserDetailsWithHRManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    // Default constructor
    public UserDetailsWithHRManager() {}

    // Parameterized constructor
    public UserDetailsWithHRManager(Long id, String name, String phone, String email, String role, String username, String password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.role = role;
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
