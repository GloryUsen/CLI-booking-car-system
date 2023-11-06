package com.mbakara;

import com.mbakara.model.enums.Role;
import com.mbakara.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService(10);

        userService.addUser("jwsven", Role.USER);

        userService.viewUsers();
    }
}
