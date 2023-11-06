package com.mbakara.service;

import com.mbakara.model.Car;
import com.mbakara.model.User;
import com.mbakara.model.enums.Role;

import java.util.Arrays;
import java.util.UUID;
public class UserService {


    private User[] users;
    private int userCount;
    private Car[] carsBook;

    public UserService(int capacity) {
        users = new User[capacity]; // Initialize the users array with the given capacity
        userCount = 0;
    }
    public void addUser(String username, Role role) {
        if (userCount < users.length) {
            users[userCount] = new User(UUID.randomUUID().toString(), username, role);
            userCount++;
        } else {
            System.out.println("User limit reached. Cannot add more users.");
        }
    }


    public void viewUsers() {
        for (User user : users) {
            if (user != null) {
                System.out.println(user);
            }
        }
    }

    public boolean isValidUser(String userId) {
        for (User user : users) {
            if (user != null && user.getUserId() == userId) {
                return true;
            }
        }
        return false;
    }

    public Car[] getCarsBook() {
        return Arrays.stream(carsBook).filter((car -> car.isBooked())).toArray(Car[]::new);
    }
    public Car[] getAvailableCars() {
        return Arrays.stream(carsBook)
                .filter(car -> car.getAvailable())
                .toArray(Car[]::new);
    }
}
