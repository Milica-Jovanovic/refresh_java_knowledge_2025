package com.company.oop.abstraction.implementation;

import com.company.oop.encapsulation.User;

public interface UserServiceImplementation {

    String userByRoleId(int id);
    User userByFirstName(String firstName);

}

// Interface can have abstract methods