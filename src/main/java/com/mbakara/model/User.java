package com.mbakara.model;

import com.mbakara.model.enums.Role;

public class User {
    private String userId;
    private String username;
    private Role role;

    public User(String userId,String username,Role role) {
        this.userId = userId;
        this.username=username;
        this.role=role;
    }

    public String getUserId() {
        return userId;
    }
    public Role getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public void setUserId(String userId) {
        this.userId=userId;
    }

    public void setUsername(String username) {
        this.username= username;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                '}';
    }
}

