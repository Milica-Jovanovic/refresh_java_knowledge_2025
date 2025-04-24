package com.company.collections;

import com.company.enums.Gender;
import com.company.oop.encapsulation.Role;
import com.company.oop.encapsulation.User;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void createList() {

        List<Integer> list = new ArrayList<>();
        list.add(5); list.add(10); list.add(20);

        for(Integer l : list) {
            System.out.println(l);
        }
    }

    public static void createUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Mica", "Jov", new Role(1, "Developer"), Gender.FEMALE));
        userList.add(new User("Mili", "Jo", new Role(2, "SE"), Gender.FEMALE));

        for(User user : userList) {
            System.out.println(user.getRole().getDescription());
        }
    }

    public static List<Role> createRoleList() {
        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role(4,"Manager"));
        roleList.add(new Role(5,"Developer"));
        roleList.add(new Role(6,"SE"));
        return roleList;
    }


}

// In Java collections we use only objects, there are no primitive data types, ww will use their wrapper classes