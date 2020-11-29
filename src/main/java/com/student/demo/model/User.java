package com.student.demo.model;

import java.util.Set;
import java.util.UUID;

public class User {

    private final UUID id;
    private final String email;
    private final String password;
    private final RoleE role;

    public User(UUID id, String email, String password, RoleE role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public RoleE getRole() {
        return role;
    }
}
