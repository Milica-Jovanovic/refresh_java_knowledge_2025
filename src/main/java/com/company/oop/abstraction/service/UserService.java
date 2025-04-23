package com.company.oop.abstraction.service;

import com.company.enums.Gender;
import com.company.oop.abstraction.implementation.UserServiceImplementation;
import com.company.oop.encapsulation.Role;
import com.company.oop.encapsulation.User;

public class UserService implements UserServiceImplementation { UserServiceImplementation userService;


    @Override
    public String userByRoleId(int id) {
        User user = new User("Mike", "Smith", new Role(id, "Admin"), Gender.MALE);
        return user.toString() + " " + user.getFirstName() + " " + user.getLastName();
    }

    @Override
    public User userByFirstName(String firstName) {
        return new User(firstName, "Smith", new Role(2, "User"), Gender.MALE);
    }
}
// override methods is mandatory