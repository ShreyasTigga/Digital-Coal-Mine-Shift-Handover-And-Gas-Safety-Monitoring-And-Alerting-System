package com.example.coalmine.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String designation;

    private String shift;

    public User() {}

    public User(String name, String email, String password, Role role, String designation, String shift) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.designation = designation;
        this.shift = shift;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public String getDesignation() {
        return designation;
    }

    public String getShift() {
        return shift;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}